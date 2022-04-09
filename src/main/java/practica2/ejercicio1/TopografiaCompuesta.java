package practica2.ejercicio1;

import java.util.*;

public class TopografiaCompuesta implements Topografia{
    private List<Topografia> componentes;

    public TopografiaCompuesta(){
        componentes = new ArrayList<>();
    }

    @Override
    public double getProporcion(){ //proporcion esta dada por la suma de la proporcion de sus componentes dividida por 4.
    	return componentes.stream().mapToDouble(elem -> elem.getProporcion()).sum() / this.componentes.size();
    }

    @Override
    public boolean esIgual(Topografia t){
        return this.getProporcion() == t.getProporcion();
    }

    public void addComponentes(Topografia t){
        if (this.componentes.size() <= 4){
            this.componentes.add(t);
        }
    }

    public double totalProporciones(){
        return this.componentes.stream().mapToDouble(elem -> elem.getProporcion()).sum();
    }

}
