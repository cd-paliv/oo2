package practica1.ejercicio1;

public class Tweet {
    static final int max_length = 140;
    private String texto;
    private Usuario creador;
    private Tweet origen;

    public Tweet(String texto) {
        this.texto = texto;
        this.origen = null;
    }

    public Tweet(Tweet origenT) {
        this.texto = origenT.getTexto();
        this.origen = origenT;
    }

    public String getTexto(){
        return this.texto;
    }

    //lo sig es solo para que no me diga que no uso las variables
    protected Usuario getCreador() {
        return creador;
    }

    protected Tweet getOrigen() {
        return origen;
    }

    
/*
    public Tweet retweet(Usuario u){

    }*/
}
