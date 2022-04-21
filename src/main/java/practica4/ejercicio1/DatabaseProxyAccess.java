package practica4.ejercicio1;

import java.util.Collection;
import java.util.List;

public class DatabaseProxyAccess implements DatabaseAccess {

	private DatabaseAccess database;
	private boolean autenticado;
	private String password;
	
	public DatabaseProxyAccess(DatabaseAccess database, String password) {
		super();
		this.database = database;
		this.autenticado = false;
		this.password = password;
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
			throw new RuntimeException("Acceso denegado");
		}
		return database.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(! this.isAutenticado()) {
			throw new RuntimeException("Acceso denegado");
		}
		return database.insertNewRow(rowData);
	}
	
	
}
