package practica3.ejercicio1;

import java.time.*;
import java.util.*;

public class ToDoItem {
	private Estado e;
    private String name;
    private LocalDate inicio;
    private LocalDate fin;
    private List<String> comments;

    /**
    * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
    */
    public ToDoItem(String name){
        this.e = new Pending();
        this.name = name;
        this.comments = new ArrayList<String>();
    }
    public String getNombre(){
        return this.name;
    }

    public void cambiarEstado(Estado e){
        this.e = e;
    }

    public void setStart(LocalDate inicio) {
		this.inicio=inicio;
	}
    public void setFinish(LocalDate fin) {
		this.fin = fin;
	}

    /**
    * Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
    * pending, si se encuentra en otro estado, no hace nada)
    */
    public void start(){
        e.start(this);
    }

    /**
    * Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
    * estado es paused. Caso contrario (pending o finished) genera un error
    * informando la causa específica del mismo
    */
    public void togglePause(){
        e.togglePause(this);
    }


    /**
    * Pasa el ToDoItem a finished (siempre y cuando su estado actual sea 
    * in-progress o pausada, si se encuentra en otro estado, no hace nada)
    */
    public void finish(){
        e.finish(this);
    }


    /**
    * Retorna el tiempo que transcurrió desde que se inició la tarea (start)
    * hasta que se finalizó. En caso de que no esté finalizada, el tiempo que
    * haya transcurrido hasta el momento actual. Si la tarea no se inició,
    * genera un error informando la causa específica del mismo.
    */
    public Duration workedTime(){
        return Duration.between(inicio, fin);
    }


    /**
    * Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
    * contrario no hace nada."
    */
    public void addComment(String comment){
        if(! (this.e instanceof Finished)){
            comments.add(comment);
        }
    }


    //para testear
    public String getNombreEstado(){
        return this.e.getClass().getSimpleName();
    }
}
