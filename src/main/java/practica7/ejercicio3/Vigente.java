package practica7.ejercicio3;

public class Vigente implements EstadoDeProyecto{

	public void invertir(Proyecto proyecto, int monto){
        proyecto.setMontoActual(proyecto.getMontoActual() + monto);
        if(proyecto.getMontoActual() >= proyecto.getMontoDeseado()){
            proyecto.cambiarEstado(new Conformado());
        }
        
    }

    public void cancelar(Proyecto proyecto){
        proyecto.cambiarEstado(new Cancelado());;
    }

	
}
