package practica5.parteII;

import java.util.ArrayList;
import java.util.List;

public class Persoonal {
	List<Persoona> personas = new ArrayList<Persoona>();
	List<Llamada> llamadas = new ArrayList<Llamada>();
	GuiaTelefonica guiaTelefonica = new GuiaTelefonica();

	
	public boolean agregarTelefono(String tel) {
		return this.guiaTelefonica.agregarNumero(tel);
	}
	
	public String getNuevoTelefono() {
		return guiaTelefonica.getUltimoTelefonoYEliminarlo();
	}
	
	public Persoona registrarUsuario(String data, String nombre, String tipoDeUsuario) {
		Persoona p = registrarUsuarioSegunTipo(data, nombre, tipoDeUsuario);
		p.setTelefono(getNuevoTelefono());
		p.setSistema(this);
		personas.add(p);
		return p;
	}
	private Persoona registrarUsuarioSegunTipo(String data, String nombre, String tipoDeUsuario) {
		if(tipoDeUsuario.equals("fisica")) {
			return new PersoonaFisica(data, nombre, getNuevoTelefono());
		}
		if(tipoDeUsuario.equals("juridica")) {
			return new PersoonaJuridica(data, nombre, getNuevoTelefono());
		}
		return null;
	}
	
	
	public boolean eliminarUsuario(Persoona p) {
		if(existeUsuario(p)) {
			personas.remove(p);
			guiaTelefonica.agregarNumero(p.getTelefono());
			return true;
		}
		return false;
	}
	
	public Llamada registrarLlamada(Persoona p1, Persoona p2, String tipoDeLlamada, int duracion) {
		Llamada l = registrarLlamadaSegunTipo(p1, p2, tipoDeLlamada, duracion);
		llamadas.add(l);
		p1.agregarLlamada(l);
		return l;
	}
	private Llamada registrarLlamadaSegunTipo(Persoona p1, Persoona p2, String tipoDeLlamada, int duracion) {
		if(tipoDeLlamada.equals("nacional")) {
			return new LlamadaNacional(p1, p2, duracion);
		}
		if(tipoDeLlamada.equals("internacional")) {
			return new LlamadaInternacional(p1, p2, duracion);
		}
		return null;
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {
		return p.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
	
}
