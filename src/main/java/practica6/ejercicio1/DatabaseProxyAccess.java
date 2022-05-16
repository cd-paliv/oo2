package practica6.ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseProxyAccess implements DatabaseAccess {

	//A. Agrego logger y pongo mensajes en getSearchResults() y insertNewRow() con niveles.
	//B. Agrego clases de formato JSONFormatter y ShoutingSimpleFormatter y los pongo como handlers en el logger.
	//C.I. Agrego clase ListFormatter y lo pongo como hanlder en el logger.
	//C.II. 
	
	private DatabaseAccess database;
	private boolean autenticado;
	private String password;
	private Logger logger = Logger.getLogger("Proxy");
	private ConsoleHandler handlerUpperCase = new ConsoleHandler();
	private ConsoleHandler handlerJSON = new ConsoleHandler();
	private ConsoleHandler handlerHide = new ConsoleHandler();
	
	public DatabaseProxyAccess(DatabaseAccess database, String password) {
		super();
		this.database = database;
		this.autenticado = false;
		this.password = password;
		configureLogs();
	}
	
	public void configureLogs() {
		handlerUpperCase.setFormatter(new ShoutingSimpleFormatter());
		this.logger.addHandler(handlerUpperCase);
		handlerJSON.setFormatter(new JSONFormatter());
		this.logger.addHandler(handlerJSON);
		List<String> lista= new ArrayList<String>();
		lista.add("sE");
		lista.add("deNEGAdo");
		handlerHide.setFormatter(new ListFormatter(lista));
		this.logger.addHandler(handlerHide);
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
