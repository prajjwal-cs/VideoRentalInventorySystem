package execution;

import definition.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("Bahubali", 5, false);
        System.out.println(
                "Video Name: " + video.getVideoName() + ", " +
                        "Video rating: " + video.getRating() + ", " +
                        "Is Video Available: " + video.isCheckOut() + "."
        );
        Video video1 = new Video();
        System.out.println(
                "Video Name: " + video1.getVideoName() + ", " +
                        "Video rating: " + video1.getRating() + ", " +
                        "Is Video Available: " + video1.isCheckOut() + "."
        );
    }
}
