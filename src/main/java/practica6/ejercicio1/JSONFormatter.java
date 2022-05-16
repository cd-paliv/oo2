package practica6.ejercicio1;

import java.util.logging.*;

public class JSONFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return "{message: " + record.getMessage() + " | level: " + record.getLevel() + "}\n";
	}

}
