package definition;

public class Video {

    // fields
    private String videoName;
    private int rating;
    private boolean checkOut;

    // Methods

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
