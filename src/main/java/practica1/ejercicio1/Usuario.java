package practica1.ejercicio1;

import java.util.*;

public class Usuario {
    private String screenName;
    private List<Tweet> tweets;
    
    public Usuario(String screenName) {
        this.screenName = screenName;
        this.tweets = new ArrayList<>();
    }

    public String getNombreUsuario(){
        return screenName;
    }
    protected boolean mismoUsuario(String screenName){
        return this.getNombreUsuario().equals(screenName);
    }

    private Tweet getUltimoTweet() {
        return this.tweets.get(this.tweets.size() - 1);
    }

    private boolean estaDentroDeRango(String t){
        return t.length() > 0 && t.length() <= 140;
    }

    public Tweet PublicarTweet(String texto){
        if(this.estaDentroDeRango(texto)){
            Tweet t = new Tweet(texto);
            this.tweets.add(t);
            return this.getUltimoTweet();
        } else return null;
    }
    public Tweet PublicarTweet(Tweet t){
        this.tweets.add(t);
        return this.getUltimoTweet();
    }

    public Tweet Retweetear(Tweet t){
        Tweet tw = new Tweet(t);
        this.tweets.add(tw);
        return this.getUltimoTweet();
    }
    public void eliminarUsuario(){
        this.tweets.clear();
    }

    public int getCantidadTweets(){
        return tweets.size();
    }
    
}
