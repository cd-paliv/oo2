package practica1.ejercicio3;

public class VideoStreamAdapter implements Media {
    
    private VideoStream vStream;

    public VideoStreamAdapter(VideoStream vStream){
        this.vStream = vStream;
    }

    @Override
    public void play() {
        this.vStream.reproduce();
    }    
}
