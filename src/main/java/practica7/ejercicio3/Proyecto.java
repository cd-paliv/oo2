package practica7.ejercicio3;

public class Proyecto {
	private int montoDeseado;
    private int montoActual;
    private String titulo;
    private Emprendedor responsable;
    private EstadoDeProyecto estado;
    
    public Proyecto(String titulo, int montoDeseado, Emprendedor responsable) {
        this.montoDeseado = montoDeseado;
        this.titulo = titulo;
        this.responsable = responsable;
        this.montoActual = 0;
        this.estado = new Vigente();
    }

    public void invertir(int monto){
        try{
            this.estado.invertir(this, monto);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void cancelar(){
        try{
            this.estado.cancelar(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void cambiarEstado(EstadoDeProyecto s){
        this.estado = s;
    }
    
    public int getMontoActual(){
        return this.montoActual;
    }

    public int getMontoDeseado(){
        return this.montoDeseado;
    }

    public void setMontoActual(int monto){
        this.montoActual = monto;
    }

	public String getTitulo() {
		return titulo;
	}

	public Emprendedor getResponsable() {
		return responsable;
	}

	public EstadoDeProyecto getEstado() {
		return estado;
	}
    
    
    
}
