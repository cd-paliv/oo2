package practica4.ejercicio2;


public class DecoratorExtension extends FileDecorator {

	public DecoratorExtension(File component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint(this.component.getExtension());
	}


}
