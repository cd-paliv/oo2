package practica1.ejercicio1;

import java.util.*;

public class Twitter {
    private List<Usuario> usuarios;
    
    public Twitter() {
        this.usuarios = new ArrayList<>();
    }

    public Usuario crearUsuario(String screenName){
        if(! this.usuarios.stream().anyMatch(u -> u.getNombreUsuario().equals(screenName))){ //si no existe ese nombre de usuario
            Usuario u = new Usuario(screenName);
            this.usuarios.add(u);
            return u;
        } else {
            System.out.println("El nombre de usuario no esta disponible");
            return null;
        }
    }

    public boolean eliminaUsuario(String nombreAEliminar){
        if(! usuarios.isEmpty()){
            Usuario aEliminar = this.usuarios.stream().filter(u -> u.mismoUsuario(nombreAEliminar)).findFirst().orElse(null);
            if (aEliminar != null){
                aEliminar.eliminarUsuario(); //borra tweets
                this.usuarios.remove(aEliminar);
                return true;
            }
        }
        return false;
    }

    public Usuario getUltimoUsuario(){
        if(! usuarios.isEmpty())
            return this.usuarios.get(this.getCantidadUsuarios() - 1);
        else return null;
    }

    public int getCantidadUsuarios(){
        return this.usuarios.size();
    }

}
