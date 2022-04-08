package practica3.ejercicio1;

import java.time.LocalDate;

public class InProgress implements Estado{

    public InProgress() {
    }

    @Override
    public void start(ToDoItem item) {

    }

    @Override
    public void togglePause(ToDoItem item) {
        item.cambiarEstado(new Paused());
    }

    @Override
    public void finish(ToDoItem item) {
        item.cambiarEstado(new Finished());
        item.setFinish(LocalDate.now());
    }

    @Override
    public boolean compareName(String className) {
        return Thread.currentThread().getStackTrace()[1].getClassName().equals(className);
    }

}
