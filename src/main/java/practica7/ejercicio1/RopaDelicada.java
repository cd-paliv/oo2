package practica7.ejercicio1;

public class RopaDelicada implements IStrategyLavado{

    @Override
    public int lavar(Lavarropas l) {
        l.agregarAgua(100);
        l.agregarJabonEnPolvo();
        l.lavar(40);
        l.vaciarAgua();
        l.agregarEnjuague();
        l.enjuagar(15);
        return 40+15;
    }
    
}
