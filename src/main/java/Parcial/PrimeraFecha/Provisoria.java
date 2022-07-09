package Parcial.PrimeraFecha;

public class Provisoria implements IState {

	@Override
	public void inscribir(Excursion e, Usuario u) {
		e.addInscripto(u);
		if(e.getCupoMinimo() == e.getCantInscriptos()) {
			e.cambiarEstado(new Definitiva());
		}
	}

	@Override
	public String obtenerInfo(Excursion e) {
		return e.getNombre() + e.getCosto() + e.getPuntoEncuentro() + (e.getCupoMinimo() - e.getCantInscriptos());
	}

}
