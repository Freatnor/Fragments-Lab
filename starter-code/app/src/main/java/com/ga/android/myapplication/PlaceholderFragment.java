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

import java.util.ArrayList;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class PlaceholderFragment extends Fragment {

   //This is a blank fragment
   //Implement your own version of Fragments for this lab

   private ImageView mImageView;
   private TextView mTextView1;
   private TextView mTextView2;
   private TextView mTextView3;

   private boolean mIsImage;
   private ArrayList<String> mStrings;

   public static PlaceholderFragment getInstance(boolean isImage, ArrayList<String> strings){
      PlaceholderFragment fragment = new PlaceholderFragment();
      fragment.mIsImage = isImage;
      if(!isImage){
         fragment.mStrings = strings;
      }
      return fragment;
   }


   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_placeholder, container, false);
      mImageView = (ImageView) view.findViewById(R.id.image_view);
      mTextView1 = (TextView) view.findViewById(R.id.text_view1);
      mTextView2 = (TextView) view.findViewById(R.id.text_view2);
      mTextView3 = (TextView) view.findViewById(R.id.text_view3);

      return view;
   }

   @Override
   public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
      super.onViewCreated(view, savedInstanceState);
      if(mIsImage){
         mImageView.setVisibility(View.VISIBLE);
         mTextView1.setVisibility(View.INVISIBLE);
         mTextView2.setVisibility(View.INVISIBLE);
         mTextView3.setVisibility(View.INVISIBLE);
      }
      else{
         mImageView.setVisibility(View.INVISIBLE);
         mTextView1.setVisibility(View.VISIBLE);
         mTextView1.setText(mStrings.get(0));
         mTextView2.setVisibility(View.VISIBLE);
         mTextView2.setText(mStrings.get(1));
         mTextView3.setVisibility(View.VISIBLE);
         mTextView3.setText(mStrings.get(2));
      }
   }
}
