package practica3.ejercicio4;


import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Similar implements Recommend{

	
	@Override
	public List<Pelicula> getRecomendaciones(List<Pelicula> d, List<Pelicula> r) {
		//similares
		List<Pelicula> s = r.stream()
							.map(p -> p.getSimilares())
							.flatMap(p -> p.stream())
							.collect(Collectors.toList());
		//novedades
		s.sort(Comparator.comparing(Pelicula::getAnioEstreno).reversed());
		//3
		return s.stream().filter( p -> !(r.contains(p)) ).limit(3).collect(Collectors.toList());
	}

}
