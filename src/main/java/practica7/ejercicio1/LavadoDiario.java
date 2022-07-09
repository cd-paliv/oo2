package practica7.ejercicio1;

public class LavadoDiario implements IStrategyLavado{

    @Override
    public int lavar(Lavarropas l) {
        l.agregarAgua(50);
        l.agregarJabonEnPolvo();
        //l.lavar(20);
        l.vaciarAgua();
        l.enjuagar(7);
        l.centrifugar(3);
        return 20+7+3;
    }
    
}
