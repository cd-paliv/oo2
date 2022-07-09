package practica7.ejercicio3;

public interface EstadoDeProyecto {

    abstract void invertir(Proyecto p, int monto) throws Exception;
	abstract void cancelar(Proyecto proyecto) throws Exception;

}
