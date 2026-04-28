package java_hm_5.Task_3;

public class Video extends Media{
    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Video is playing " + title + " in high resolution " + resolution);
    }
}
