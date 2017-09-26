package jag.okinawa.androidstudy.myapplication;

/**
 * データオブジェクト
 * String pdc-k-kamiya on 2017/09/25.
 */
public class MyModel {
    private String mImageUrl;
    private String mTitle;
    private String mDescription;

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
