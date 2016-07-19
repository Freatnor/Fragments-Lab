package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class PlaceholderFragment extends Fragment {

   //This is a blank fragment
   //Implement your own version of Fragments for this lab

   ImageView mImageView;
   TextView mTextView1;
   TextView mTextView2;
   TextView mTextView3;


   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_placeholder, container, false);

      return view;
   }
}
