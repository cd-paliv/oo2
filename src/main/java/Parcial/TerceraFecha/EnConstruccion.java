package Parcial.TerceraFecha;

public class EnConstruccion implements IState {

	@Override
	public void AprobarEtapa(Proyecto p) {
		// TODO Auto-generated method stub
		//p.PrecioDelProyecto() != 0
		if(Double.compare(p.PrecioDelProyecto(), 0.0) > 0) {
			p.cambiarEstado(new EnEvaluacion());
		}
		throw new RuntimeException("El proyecto tiene precio 0");
	}

	@Override
	public void ModificarMargen(Proyecto p, double margen) {
		// TODO Auto-generated method stub
		if((margen > 7) && (margen < 11)){
			p.setMargen(margen);
		}
	}

	@Override
	public void CancelarProyecto(Proyecto p) {
		// TODO Auto-generated method stub
		p.setObjetivo("Cancelado");
		p.cambiarEstado(new Cancelado());
	}

}
