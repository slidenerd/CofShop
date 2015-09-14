package slidenerd.vivz.gpdemo.model;

import com.google.gson.annotations.SerializedName;

public class Location {
    @SerializedName("lng")
    private String longitude;

    @SerializedName("lat")
    private String latitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Location [longitude = " + longitude + ", latitude = " + latitude + "]";
    }
}