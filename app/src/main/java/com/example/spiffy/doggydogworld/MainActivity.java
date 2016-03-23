package com.example.spiffy.doggydogworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog myDog = new Dog("Doge");

        Dog yourDog = new Dog("Rex");

        myDog.barkAt("a cat");

    }
}
