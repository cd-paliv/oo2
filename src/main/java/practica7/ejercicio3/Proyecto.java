package practica7.ejercicio3;

public class Proyecto {
    private String titulo;
    private int montoAAlcanzar;
    private int montoTotalRecibido;
    private Emprendedor responsable;
    private EstadoDeProyecto estado;
    
    public Proyecto(String titulo, int montoAAlcanzar, int montoTotalRecibido, Emprendedor responsable,
			EstadoDeProyecto estado) {
		super();
		this.titulo = titulo;
		this.montoAAlcanzar = montoAAlcanzar;
		this.montoTotalRecibido = montoTotalRecibido;
		this.responsable = responsable;
		this.estado = estado;
	}

    public void invertir(int monto) {
    	montoTotalRecibido += monto;
    }
    
    public void cancelarProyecto(){
        try {
			estado.cancelar(this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
    
    public void setEstado(EstadoDeProyecto e) {
    	estado = e;
    }

	public String getTitulo() {
		return titulo;
	}

	public int getMontoAAlcanzar() {
		return montoAAlcanzar;
	}

	public int getMontoTotalRecibido() {
		return montoTotalRecibido;
	}   
    
}
