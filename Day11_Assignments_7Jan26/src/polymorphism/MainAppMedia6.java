package polymorphism;

public class MainAppMedia6 {
    public static void main(String[] args) {

        MediaFile m1 = new AudioFile();
        MediaFile m2 = new VideoFile();
        MediaFile m3 = new Podcast();

        m1.play();
        m2.play();
        m3.play();
    }
}
