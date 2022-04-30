package practica5.parteII;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	private SortedSet<String> guia = new TreeSet<String>();
	
	public boolean existeNumero(String n) {
		return this.guia.contains(n);
	}
	
	public boolean agregarNumero(String n) {
		if(! existeNumero(n)) {
			this.guia.add(n);
			return true;
		}
		return false;
	}
	
	public String getUltimoTelefonoYEliminarlo() {
		if(guia.isEmpty()) { //si no verifico esto no me pasa el test
			String telefono = this.guia.last();
			this.guia.remove(telefono);
			return telefono;
		}
		return "";
	}
}
