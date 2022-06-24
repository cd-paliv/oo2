package practica7.ejercicio3;

public class Cancelado extends EstadoDeProyecto {

	@Override
	void invertirEnProyecto(Proyecto p, int monto) throws Exception {
		throw new Exception("Este proyecto esta cancelado. No puede invertir.");
	}

	@Override
	void cancelar(Proyecto proyecto) throws Exception {
		throw new Exception("Este proyecto ya esta cancelado.");
	}

}
