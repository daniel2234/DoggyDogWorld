package com.example.spiffy.doggydogworld;

import android.util.Log;

/**
 * Created by Spiffy on 3/23/2016.
 */
public class Dog {
    private String name;
    private int age;
    private int numberOfLegs = 4;
    private String breed;

    Dog(){
        Log.d("Dog", "Constructing...");
    }

    Dog(String dogName){
        name = dogName;
    }
    public void bark(){
        String bark = name + " barked";
        Log.d("Dog",bark);
    }

    public void barkAt(String victim){
        String bark = name + " barked at " +victim;
        Log.d("Dog", bark);
    }
}
