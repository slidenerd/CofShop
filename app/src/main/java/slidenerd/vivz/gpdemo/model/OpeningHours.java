package slidenerd.vivz.gpdemo.model;

import com.google.gson.annotations.SerializedName;

public class OpeningHours {
    @SerializedName("open_now")
    private String openNow;

    @SerializedName("weekday_text")
    private String[] weekdayText;

    public String getOpenNow() {
        return openNow;
    }

    public void setOpenNow(String openNow) {
        this.openNow = openNow;
    }

    public String[] getWeekdayText() {
        return weekdayText;
    }

    public void setWeekdayText(String[] weekdayText) {
        this.weekdayText = weekdayText;
    }

    @Override
    public String toString() {
        return "ClassPojo [openNow = " + openNow + ", weekdayText = " + weekdayText + "]";
    }
}
