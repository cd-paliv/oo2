package practica3.ejercicio4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements Recommend {

	@Override
	public List<Pelicula> getRecomendaciones(List<Pelicula> d, List<Pelicula> r) {
		d.sort(Comparator.comparing(Pelicula::getAnioEstreno).reversed());
		return d.stream().filter( p -> !(r.contains(p)) ).limit(3).collect(Collectors.toList());
	}


}
