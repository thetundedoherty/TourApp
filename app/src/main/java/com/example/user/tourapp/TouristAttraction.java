package com.example.user.tourapp;

/**
 * Created by USER on 6/2/2017.
 */

public class TouristAttraction {
    //Title of tourist attraction
    private String mTitle;

    // overview of the location
    private String mOverview;

    // Image resources for Location object
    private int mImageResourceID;


    // Create a new object Tourist Attraction

    /**
     *
     * @param title
     * @param overview
     * @param imageResourceId
     */

    public TouristAttraction(String title, String overview, int imageResourceId){
        mTitle = title;
        mOverview = overview;
        mImageResourceID = imageResourceId;
    }

    public String getmOverview() {
        return mOverview;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public String getmTitle() {
        return mTitle;
    }
}
