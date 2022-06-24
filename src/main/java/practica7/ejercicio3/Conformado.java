package practica7.ejercicio3;

public class Conformado extends EstadoDeProyecto {

	@Override
	void invertirEnProyecto(Proyecto p, int monto) throws Exception {
		p.invertir(monto);
	}

	@Override
	void cancelar(Proyecto proyecto) throws Exception {
		throw new Exception("El proyecto ya está conformado. No puede cancelarlo.");
	}

}
