package practica3.ejercicio1;

public class Finished implements Estado{

    public Finished() {
    }

    @Override
    public void start(ToDoItem item) {
    }

    @Override
    public void togglePause(ToDoItem item) {
        throw new RuntimeException("El objeto ya se encuentra finalizado");
    }

    @Override
    public void finish(ToDoItem item) {
    }

    @Override
    public boolean compareName(String className) {
        return Thread.currentThread().getStackTrace()[1].getClassName().equals(className);
    }

}
