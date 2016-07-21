package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jonathan Taylor on 7/19/16.
 */
public class DetailFragment extends Fragment {

    private TextView mTextView;
    private String[] mInterests;
    private int mPosition;

    public static DetailFragment getInstance(int position){
        DetailFragment fragment = new DetailFragment();
        fragment.mPosition = position;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        mTextView = (TextView) view.findViewById(R.id.detail_text_view);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mTextView.setText(getResources().getStringArray(R.array.interests)[mPosition]);
        super.onViewCreated(view, savedInstanceState);
    }
}
