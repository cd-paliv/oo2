package practica3.ejercicio3;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator {

	@Override
	public int crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		Long result = crc.getValue();
		return result.intValue();
	}

}
