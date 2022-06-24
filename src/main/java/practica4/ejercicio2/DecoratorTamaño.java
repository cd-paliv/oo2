package practica4.ejercicio2;


public class DecoratorTamaño extends FileDecorator  {

	public DecoratorTamaño(FileOO2 component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return super.prettyPrint(Double.toString(this.component.getTamaño()));
	}


}
