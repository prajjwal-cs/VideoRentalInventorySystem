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

    // We have special methods to take care of that
    // 1. getter method : It is used to read the value of a private field.
    // Observer Method / Accessor Method
    public String getVideoName() {
        return videoName;  // ctrl + shift + k. to push
    }

    public int getRating() {
        return rating;
    }

    public boolean isCheckOut() {
        return checkOut;
    }
}
