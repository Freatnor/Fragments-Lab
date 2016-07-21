package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements InterestsListFragment.OnInterestClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_content_container,
                        MainFragment.getInstance(this))
                .commit();

    }

    @Override
    public void onInterestClicked(int position) {
        getSupportFragmentManager().beginTransaction().addToBackStack("Tabs").add(R.id.main_content_container, DetailFragment.getInstance(position), null)
                .commit();
    }
}
