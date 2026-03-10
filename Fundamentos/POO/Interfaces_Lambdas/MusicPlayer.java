package POO.Interfaces_Lambdas;

public interface MusicPlayer {

//    ‘Interfaces’ tem que trabalhar com metodos abstratos


//    public final static String music = "Parabéns pra você";
    public String music = "Parabéns pra você";

    default void playMusic() {
        System.out.println(music);
    }
    void pauseMusic();
    void stopMusic();

}

