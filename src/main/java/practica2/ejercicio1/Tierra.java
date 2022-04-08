package practica2.ejercicio1;

public class Tierra implements Topografia{

    @Override
    public double getProporcion() {
        return 0;
    }

    @Override
    public boolean esIgual(Topografia t) {
        return this.getProporcion() == t.getProporcion();
    }
}
