package POO.Interfaces_Lambdas;

public class Computer implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
        System.out.println("Computer está : Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Computer está : PAUSE");
    }

    @Override
    public void stopMusic() {
        System.out.println("Computer está : Stopping music");
    }

    @Override
    public void playVideo() {
        System.out.println("Computer está : Playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Computer está : Pausing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Computer está : Stopping video");
    }
}
