package java_hm_5.Task_3;

public class Program {
    public static void main(String[] args) {
        Media[] mediaList = {
                new Music("Song 1", 3, "Artist A"),
                new Video("Video 1", 10, "1920x1080")
        };

        for (Media media : mediaList) {
            media.play();
        }
    }
}
