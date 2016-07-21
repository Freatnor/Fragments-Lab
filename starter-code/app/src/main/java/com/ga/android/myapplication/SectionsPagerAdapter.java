package com.ga.android.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private int mPageCount;
    private InterestsListFragment.OnInterestClickListener mListener;
    private ArrayList<String> mAboutMe = new ArrayList<>();
    private ArrayList<String> mContact = new ArrayList<>();

    public SectionsPagerAdapter(FragmentManager fm, int pageCount, InterestsListFragment.OnInterestClickListener listener) {
        super(fm);
        mPageCount = pageCount;
        mListener = listener;
        mAboutMe.add("Current City: New York");
        mAboutMe.add("Job: Student");
        mAboutMe.add("School: General Assembly ADI");

        mContact.add("Phone: 202-288-3355");
        mContact.add("Email: jonathan.randall.taylor@gmail.com");
        mContact.add("Steam: Freatnor");

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            //Complete this
            case 1: return PlaceholderFragment.getInstance(false, mAboutMe);
            case 2: return PlaceholderFragment.getInstance(false, mContact);
            case 3: return InterestsListFragment.getInstance(mListener);
            default: return PlaceholderFragment.getInstance(true, null);
        }

    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return mPageCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            default:
            case 0:
                return "PICTURE";
            case 1:
                return "ABOUT ME";
            case 2:
                return "CONTACT";
            case 3:
                return "INTERESTS";
        }

    }
}
