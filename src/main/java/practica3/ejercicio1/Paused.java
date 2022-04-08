package practica3.ejercicio1;

public class Paused implements Estado{

    public Paused() {
    }

    @Override
    public void start(ToDoItem item) {

    }

    @Override
    public void togglePause(ToDoItem item) {
        item.cambiarEstado(new InProgress());
    }

    @Override
    public void finish(ToDoItem item) {
        item.cambiarEstado(new Finished());
    }

    @Override
    public boolean compareName(String className) {
        return Thread.currentThread().getStackTrace()[1].getClassName().equals(className);
    }


}
