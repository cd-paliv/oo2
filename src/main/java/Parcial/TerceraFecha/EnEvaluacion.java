package Parcial.TerceraFecha;

public class EnEvaluacion implements IState {

	@Override
	public void AprobarEtapa(Proyecto p) {
		// TODO Auto-generated method stub
		p.cambiarEstado(new Confirmada());
	}

	@Override
	public void ModificarMargen(Proyecto p, double margen) {
		// TODO Auto-generated method stub
		if((margen > 10) && (margen < 16)){
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
