package Parcial.PrimeraFecha;

public class Definitiva implements IState {

	@Override
	public void inscribir(Excursion e, Usuario u) {
		e.addInscripto(u);
		if(e.getCupoMaximo() == e.getCantInscriptos()) {
			e.iniciarEspera();
			e.cambiarEstado(new Llena());
		}
	}

	@Override
	public String obtenerInfo(Excursion e) {
		return e.getNombre() + e.getCosto() + e.getPuntoEncuentro() + e.getMailInscriptos() + (e.getCupoMaximo() - e.getCantInscriptos());
	}

}
