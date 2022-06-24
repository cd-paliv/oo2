package practica7.ejercicio3;

public abstract class EstadoDeProyecto {

    abstract void invertirEnProyecto(Proyecto p, int monto) throws Exception;
	abstract void cancelar(Proyecto proyecto) throws Exception;

}
