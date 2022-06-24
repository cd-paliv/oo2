package practica7.ejercicio3;

public class Vigente extends EstadoDeProyecto{

	@Override
	void invertirEnProyecto(Proyecto p, int monto) {
		p.invertir(monto);
	}

	@Override
	void cancelar(Proyecto p) {
		p.setEstado(new Cancelado());
	}

	
}
