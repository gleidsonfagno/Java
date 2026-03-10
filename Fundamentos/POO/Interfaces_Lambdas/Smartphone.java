package POO.Interfaces_Lambdas;

public class Smartphone implements VideoPlayer, MusicPlayer {

//    nâo pode ter Construtores;
    @Override
    public void playMusic() {
        System.out.println("Smartphone está: Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Smartphone está: PAUSE");
    }

    @Override
    public void stopMusic() {
        System.out.println("Smartphone está: Stopping music");
    }

    @Override
    public void playVideo() {
        System.out.println("Smartphone está: Playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Smartphone está: Pausing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Smartphone está: Stopping video");
    }
}
