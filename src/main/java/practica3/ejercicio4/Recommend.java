package practica3.ejercicio4;

import java.util.List;

public interface Recommend {

	public List<Pelicula> getRecomendaciones(List<Pelicula> disponbles, List<Pelicula> reproducidas);
}
