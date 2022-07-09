package Parcial.PrimeraFecha;

public class Llena implements IState {

	@Override
	public void inscribir(Excursion e, Usuario u) {
		e.addEspera(u);
	}

	@Override
	public String obtenerInfo(Excursion e) {
		// TODO Auto-generated method stub
		return e.getNombre() + e.getCosto() + e.getPuntoEncuentro();
	}

}
