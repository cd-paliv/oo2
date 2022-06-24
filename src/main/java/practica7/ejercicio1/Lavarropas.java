package practica7.ejercicio1;

public class Lavarropas {
    private int minutos;
    private int porcentajeAgua;
    private boolean jabonEnPolvo;
    private boolean enjuagado;
    private IStrategyLavado programa;

    public Lavarropas(IStrategyLavado p){
        minutos = 0;
        this.vaciarAgua();
        jabonEnPolvo = false;
        enjuagado = false;
        programa = p;
    }

    public void cambiarProgramaDeLavado(IStrategyLavado p){
        programa = p;
    }
    
    public void agregarAgua(int porcentaje) {
        porcentajeAgua += porcentaje;
    }

    public void agregarJabonEnPolvo() {
        jabonEnPolvo = true;
    }

    public int lavar() {
    	return programa.lavar(this);
    }
    
    public void lavar(int minutos) {
    	
    }

    public void vaciarAgua() {
        porcentajeAgua = 0;
    }

    public void agregarEnjuague() {
        enjuagado = true;
    }

    public void enjuagar(int minutos) {
        if(enjuagado){
            int x=0;
            while(x <= minutos){
                x++;
            }
        }
    }

    public void centrifugar(int minutos) {
        int x=0;
        while(x <= minutos){
            x++;
        }
    }

}
