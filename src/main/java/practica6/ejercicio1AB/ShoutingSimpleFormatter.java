package practica6.ejercicio1AB;

import java.util.logging.*;

public class ShoutingSimpleFormatter extends SimpleFormatter{

	public String format(LogRecord record) {
		return super.format(record).toUpperCase();
	}
}
