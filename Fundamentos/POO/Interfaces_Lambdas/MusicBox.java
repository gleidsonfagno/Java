package POO.Interfaces_Lambdas;

public class MusicBox implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("Bom box está : Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Bom box está : PAUSE");
    }

    @Override
    public void stopMusic() {
        System.out.println("Bom box está : Stopping music");
    }

}
