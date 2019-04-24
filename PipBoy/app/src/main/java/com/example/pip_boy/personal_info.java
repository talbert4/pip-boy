package com.example.pip_boy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class personal_info extends AppCompatActivity {
    /**
     * Personal information the user inputs.
     */
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String gender;
    private final String species;
    private final String classType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
    }

}
