package practica2.ejercicio1;

public class Agua implements Topografia {

    @Override
    public double getProporcion() {
        return 1;
    }

    @Override
    public boolean esIgual(Topografia t) {
        return this.getProporcion() == t.getProporcion();
    }
}
