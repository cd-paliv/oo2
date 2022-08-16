package Parcial.TerceraFecha;

public class EnConstruccion extends IState {

	@Override
	public void AprobarEtapa(Proyecto p) {
		// TODO Auto-generated method stub
		if(Double.compare(p.PrecioDelProyecto(), 0.0) > 0) { //p.PrecioDelProyecto() != 0
			p.cambiarEstado(new EnEvaluacion());
		} else {
			throw new RuntimeException("ERROR: El proyecto tiene precio 0");
		}
	}

	@Override
	public void ModificarMargen(Proyecto p, double margen) {
		// TODO Auto-generated method stub
		if((margen > 7) && (margen < 11)){
			p.setMargen(margen);
		}
	}


}
