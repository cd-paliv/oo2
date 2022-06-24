package practica4.ejercicio2;


public class DecoratorCreacion extends FileDecorator {

	public DecoratorCreacion(FileOO2 component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return super.prettyPrint(this.component.getCreacion().toString());
	}


}
