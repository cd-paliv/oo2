package practica3.ejercicio1;

public interface Estado {
	public void start(ToDoItem i);
    public void togglePause(ToDoItem item);
    public void finish(ToDoItem item);
    public boolean compareName(String name);
}
