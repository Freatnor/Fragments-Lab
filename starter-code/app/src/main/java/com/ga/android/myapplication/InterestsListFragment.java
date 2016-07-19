package com.ga.android.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Jonathan Taylor on 7/19/16.
 */
public class InterestsListFragment extends Fragment {

    public interface OnInterestClickListener{
        void onInterestClicked(int position);
    }

    private OnInterestClickListener mOnInterestClickListener;

    public static InterestsListFragment getInstance(OnInterestClickListener listener) {
        InterestsListFragment fragment = new InterestsListFragment();
        fragment.mOnInterestClickListener = listener;
        return fragment;
    }

    private ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//Inflate your layout
        View v = inflater.inflate(R.layout.fragment_list, container, false);

//Get a reference to the XML created ListView
        mListView = (ListView) v.findViewById(R.id.listview_fragment);

//Return the view containing the layout that was just inflated
        return v;
    }

//------onViewCreated--------------------------------------//

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//Instantiate a new ArrayAdapter using the string array we created in XML
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.interests));

//Set adapter on ListView
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                mOnInterestClickListener.onInterestClicked(position);
            }
        });
    }
}
}
