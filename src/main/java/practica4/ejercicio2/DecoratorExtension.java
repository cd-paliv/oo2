package practica4.ejercicio2;


public class DecoratorExtension extends FileDecorator {

	public DecoratorExtension(FileOO2 component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint(this.component.getExtension());
	}


}
