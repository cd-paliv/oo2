package practica6.ejercicio1;

import java.util.logging.*;

public class ShoutingSimpleFormatter extends SimpleFormatter{

	public String format(LogRecord record) {
		return super.format(record).toUpperCase();
	}
}
