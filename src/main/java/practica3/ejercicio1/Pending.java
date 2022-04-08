package practica3.ejercicio1;

import java.time.LocalDate;

public class Pending implements Estado{

    public Pending() {
    }

    @Override
    public void start(ToDoItem item) {
        item.cambiarEstado(new InProgress());
        item.setStart(LocalDate.now());
    }

    @Override
    public void togglePause(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void finish(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public boolean compareName(String className) {
        return Thread.currentThread().getStackTrace()[1].getClassName().equals(className);
    }

    
}
