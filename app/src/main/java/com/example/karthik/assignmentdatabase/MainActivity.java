package com.example.karthik.assignmentdatabase;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager mgr;
    FragmentTransaction t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            mgr = getSupportFragmentManager();
            t = mgr.beginTransaction();

            EnquiryFragment ef = new EnquiryFragment();

            t.add(R.id.container, ef);
            t.commit();
        }
    }

    public void loadDisplay(){

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction t = manager.beginTransaction();

        DisplayFragment df = new DisplayFragment();

        t.replace(R.id.container,df);
        t.addToBackStack(null);
        t.commit();
    }
}