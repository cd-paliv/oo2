package Parcial.TerceraFecha;

public abstract class IState {
	public abstract void AprobarEtapa(Proyecto p);
	public abstract void ModificarMargen(Proyecto p, double margen);
	
	public void CancelarProyecto(Proyecto p) {
		p.setObjetivo("Cancelado");
		p.cambiarEstado(new Cancelado());
	}
}
