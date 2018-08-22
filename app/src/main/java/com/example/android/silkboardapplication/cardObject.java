package com.example.android.silkboardapplication;

import android.graphics.drawable.Drawable;
import android.location.Location;

public class cardObject {
    int image;
    String farmName;
    String address;
    Boolean status;
    Location current;
    Location destination;
    float distance;

    public cardObject(){}

    public cardObject(int image, String farmName, String address, Boolean status,float distance) {
        this.image = image;
        this.farmName = farmName;
        this.address = address;
        this.status = status;
        this.distance=distance;
    }

   /* public cardObject(int image, String farmName, String address, Boolean status, Location current, Location destination) {
        this.image = image;
        this.farmName = farmName;
        this.address = address;
        this.status = status;
        this.current = current;
        this.destination = destination;
        this.distance=(current.distanceTo(destination)*1000)/100; //round off to 2 decimal place
    }*/
}
