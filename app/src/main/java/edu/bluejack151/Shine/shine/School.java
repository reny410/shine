package edu.bluejack151.Shine.shine;

import java.io.Serializable;

/**
 * Created by rei on 12/20/2015.
 */
public class School implements Serializable {
    private String id;
    private String name;
    private int rate;
    private double latitude;
    private double longitude;

    public School(String name, double lat, double lon, int rate){
        this.name = name;
        this.latitude = lat;
        this.longitude = lon;
        this.rate = rate;
    }

    public School(String id, String name, int rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public School(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
