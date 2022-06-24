package practica4.ejercicio2;


public class DecoratorPermisos extends FileDecorator  {

	public DecoratorPermisos(FileOO2 component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return super.prettyPrint(this.component.getPermisos());
	}

}
