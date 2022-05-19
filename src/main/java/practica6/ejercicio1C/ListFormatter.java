package practica6.ejercicio1C;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class ListFormatter extends Formatter {

	private List<String> palabrasOcultar;
	
	public ListFormatter() {
		super();
		this.palabrasOcultar = new ArrayList<String>();
	}
	
	public ListFormatter(String msg) {
		super();
		this.palabrasOcultar.add(msg);
	}
	
	public ListFormatter(List<String> l) {
		super();
		//l.stream().forEach(m -> m.toUpperCase());
		this.palabrasOcultar = l;
		
	}
	
	@Override
	public String format(LogRecord record) {
		String msg = record.getMessage();
		
		String palabra = palabrasOcultar.stream()
										.filter(m -> msg.toLowerCase().contains(m.toLowerCase()))
										.findFirst()
										.orElse(null);
		
		return palabra != null ? (msg.replaceAll("(?i)"+palabra, "***")  + "\n") : (msg + "\n");
	}

}
