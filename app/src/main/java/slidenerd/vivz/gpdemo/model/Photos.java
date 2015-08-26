package slidenerd.vivz.gpdemo.model;

import com.google.gson.annotations.SerializedName;

public class Photos {
    @SerializedName("photo_reference")
    private String photoReference;

    @SerializedName("height")
    private String height;

    @SerializedName("html_attributions")
    private String[] htmlAttributions;

    @SerializedName("width")
    private String width;

    public String getPhotoReference() {
        return photoReference;
    }

    public void setPhotoReference(String photoReference) {
        this.photoReference = photoReference;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String[] getHtmlAttributions() {
        return htmlAttributions;
    }

    public void setHtmlAttributions(String[] htmlAttributions) {
        this.htmlAttributions = htmlAttributions;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Photos [photoReference = " + photoReference + ", height = " + height + ", htmlAttributions = " + htmlAttributions + ", width = " + width + "]";
    }
}