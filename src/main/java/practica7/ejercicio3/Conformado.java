package practica7.ejercicio3;

public class Conformado implements EstadoDeProyecto {

	public void invertir(Proyecto proyecto, int monto){
        proyecto.setMontoActual(proyecto.getMontoActual() + monto);
    }

    public void cancelar(Proyecto proyecto) throws Exception{
        throw new Exception("No se puede cancelar un proyecto conformado");
    }

}
