package Parcial.TerceraFecha;

public interface IState {
	public void AprobarEtapa(Proyecto p);
	public void ModificarMargen(Proyecto p, double margen);
	public void CancelarProyecto(Proyecto p);
}
