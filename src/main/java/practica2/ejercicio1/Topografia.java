package practica2.ejercicio1;

public abstract class Topografia {

    public abstract double getProporcionAgua();
    
    public double getProporcionTierra() {
    	return 1 - this.getProporcionAgua();
    }

    public boolean esIgual(Topografia t) {
    	return this.getProporcionAgua() == t.getProporcionAgua();
    }
}
