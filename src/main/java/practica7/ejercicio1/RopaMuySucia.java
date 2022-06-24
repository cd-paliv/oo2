package practica7.ejercicio1;

public class RopaMuySucia implements IStrategyLavado{

    @Override
    public int lavar(Lavarropas l) {
        l.agregarAgua(100);
        l.agregarJabonEnPolvo();
        l.lavar(100);
        l.vaciarAgua();
        l.agregarAgua(100);
        l.agregarJabonEnPolvo();
        l.lavar(30);
        l.vaciarAgua();
        l.agregarAgua(100);
        l.agregarEnjuague();
        l.enjuagar(15);
        l.centrifugar(10);
        return 100+30+15+10;
    }
    
}
