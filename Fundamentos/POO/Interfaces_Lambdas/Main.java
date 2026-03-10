package POO.Interfaces_Lambdas;

public class Main {
    static String music = MusicPlayer.music;
    public static void main(String[] args) {

    Smartphone smartphone = new Smartphone();
    Computer computer = new Computer();


//    MusicPlayer musicPlayer = new MusicPlayer() {
//        @Override
//        public void playMusic() {
//            MusicPlayer.super.playMusic();
//        }
//
//        @Override
//        public void pauseMusic() {
//
//        }
//
//        @Override
//        public void stopMusic() {
//
//        }
//    };

     runVideo(computer);
     runMusic(smartphone);
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
