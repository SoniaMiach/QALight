package java_hm_5.Task_3;

public class Music extends Media{
    private String artist;

    public Music(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Music is playing " + artist + ": " + title);
    }
}
