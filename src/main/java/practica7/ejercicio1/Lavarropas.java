package practica7.ejercicio1;

public class Lavarropas {
	private IStrategyLavado strategy;

    public int lavar(int minutos){
        return this.strategy.lavar(this);
    }

    public void cambiarProgramaDeLavado(IStrategyLavado strategy){
        this.strategy = strategy;
    }
    
    public void agregarAgua(int porcentaje){}
    public void agregarJabonEnPolvo(){}
    public void vaciarAgua(){}
    public void enjuagar(int minutos){}
    public void centrifugar(int minutos){}
	public void agregarEnjuague() {}

}
