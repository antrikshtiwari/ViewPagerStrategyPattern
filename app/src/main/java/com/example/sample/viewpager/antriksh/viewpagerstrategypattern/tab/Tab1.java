package com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.R;

/**
 * Created by antrikshtiwari on 14/05/16.
 */
public class Tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        return view;
    }
}
