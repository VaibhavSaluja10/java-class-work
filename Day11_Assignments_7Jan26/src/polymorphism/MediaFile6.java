package polymorphism;

class MediaFile {
    public void play() {
        System.out.println("Playing media file");
    }
}

class AudioFile extends MediaFile {
    public void play() {
        System.out.println("Playing audio file");
    }
}

class VideoFile extends MediaFile {
    public void play() {
        System.out.println("Playing video file");
    }
}

class Podcast extends MediaFile {
    public void play() {
        System.out.println("Playing podcast");
    }
}
