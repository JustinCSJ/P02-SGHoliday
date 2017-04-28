package com.example.a15017573.p02_sgholiday;

/**
 * Created by 15017573 on 28/4/2017.
 */

public class Holiday {
    private String holiday;
    private String date;
    private int image;

    public Holiday(String holiday, String date, int image){
        this.holiday = holiday;
        this.date = date;
        this.image = image;
    }

    public String getHoliday() {
        return holiday;
    }

    public String getDate() {
        return date;
    }

    public int isImage() {
        return image;
    }
}
