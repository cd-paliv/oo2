package practica6.ejercicio1C;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseProxyAccess implements DatabaseAccess {

	//C.I. Agrego clase ListFormatter y lo pongo como handler en el logger.
	//C.II. 
	
	private DatabaseAccess database;
	private boolean autenticado;
	private String password;
	private Logger logger = Logger.getLogger("Proxy");
	private ConsoleHandler handlerHide = new ConsoleHandler();
	//private ConsoleHandler MailHandler = new ConsoleHandler();
	
	public DatabaseProxyAccess(DatabaseAccess database, String password) throws IOException {
		super();
		this.database = database;
		this.autenticado = false;
		this.password = password;
		configureLogs();
	}
	
	public void configureLogs() throws IOException{
		//C.I.
		handlerHide.setFormatter(new ListFormatter(Arrays.asList("deNEGAdo", "se")));
		this.logger.addHandler(handlerHide);
		//C.II.
		this.logger.addHandler(new MailHandler());
		//---------------------------------------
		logger.setUseParentHandlers(false); //ignora los handlers del super() asi solo usa los handlers que yo seteo
	}

	public boolean isAutenticado() {
		return this.autenticado;
	}
	
	public boolean autenticar(String password) {
		if(this.password.equals(password)) {
			this.autenticado = true;
		}
		return this.autenticado;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(! this.isAutenticado()) {
			logger.severe("Acceso denegado");
			throw new RuntimeException("Acceso denegado");
		}
		logger.info("Se busca");
		return database.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(! this.isAutenticado()) {
			logger.severe("Acceso denegado");
			throw new RuntimeException("Acceso denegado");
		}
		logger.warning("Se inserta");
		return database.insertNewRow(rowData);
	}
	
	
	
}
