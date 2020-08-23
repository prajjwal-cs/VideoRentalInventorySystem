package definition;

public class Video {

    // create definition classes
    // Rules:
    // 1. Always set the visibility modifier of fields to private unless otherwise specified.
    // 2. Always set the aess modifier of fields to non static unless otherwise specified.
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
    public String gatName() {
        return videoName;
    }

}
