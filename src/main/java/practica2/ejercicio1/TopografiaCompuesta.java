package practica2.ejercicio1;

import java.util.*;

public class TopografiaCompuesta extends Topografia{
    private List<Topografia> componentes;

    public TopografiaCompuesta(){
        componentes = new ArrayList<>();
    }
    
    //proporcion esta dada por la suma de la proporcion de sus componentes dividida por 4.
    @Override
    public double getProporcionAgua(){ 
    	return componentes.stream().mapToDouble(elem -> elem.getProporcionAgua()).sum() / this.componentes.size();
    }
    
    @Override
	public double getProporcionTierra() {
		return componentes.stream().mapToDouble(elem -> elem.getProporcionTierra()).sum() / this.componentes.size();
	}

    public double getProporcion() {
        return this.getProporcionAgua() + this.getProporcionTierra();
    }

    @Override
    public boolean esIgual(Topografia t){
        return (this.getProporcionAgua() == t.getProporcionAgua()) && (this.getProporcionTierra() == t.getProporcionTierra());
    }

    public void addComponentes(Topografia t){
        if (this.componentes.size() <= 4){
            this.componentes.add(t);
        }
    }

    public double totalProporciones(){
        return this.componentes.stream().mapToDouble(elem -> elem.getProporcionAgua()).sum();
    }

}
