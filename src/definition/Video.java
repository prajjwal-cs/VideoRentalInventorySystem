package definition;

public class Video {

    // fields
    private String videoName;
    private int rating;
    private boolean checkOut;

    // Methods

    // Non Parameterized Constructor method : It has no parameters
    public Video() {
        this.videoName = "Surya namo";
        this.rating = 4;
        this.checkOut = false;
    }

    // Parameterized constructor method : It has some parameters
    public Video(String videoName, int rating, boolean checkOut) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = checkOut;
    }

    /**
     * This method returns the name of the video.
     *
     * @return The name of the video.
     */
    public String getVideoName() {
        return videoName;  // ctrl + shift + k. to push
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}
