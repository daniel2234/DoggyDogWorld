package com.example.spiffy.doggydogworld;

import android.util.Log;

/**
 * Created by Spiffy on 3/23/2016.
 */
public class Dog {
    String name;
    int age;
    int numberOfLegs = 4;
    String breed;

    void bark(){
        String bark = name + " barked";
        Log.d("Dog",bark);
    }

    void barkAt(String victim){
        String bark = name + " barked at " +victim;
        Log.d("Dog", bark);
    }
}
