package practica4.ejercicio2;


public class DecoratorNombre extends FileDecorator {

	public DecoratorNombre(File component) {
		super(component);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint(this.component.getNombre());
	}


	
	
}
