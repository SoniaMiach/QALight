package java_hm_5.Task_3;

public class Media {
    protected String title;
    protected int duration;

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Multimedia playback");
    }
}
