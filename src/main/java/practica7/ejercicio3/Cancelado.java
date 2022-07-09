package practica7.ejercicio3;

public class Cancelado implements EstadoDeProyecto {

	public void invertir(Proyecto proyecto, int monto) throws Exception{
        throw new Exception("El proyecto se encuentra cancelado");
    }

    public void cancelar(Proyecto proyecto) throws Exception{
        throw new Exception("El proyecto se encuentra cancelado");
    }

}
