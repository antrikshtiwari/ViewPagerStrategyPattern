package com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab.impl;

import android.util.Log;

/**
 * Created by antrikshtiwari on 18/05/16.
 */
public class Tab1Impl implements ToDoTask {

    @Override
    public void doSomeTask() {
        Log.d(Tab1Impl.class.getName(), ">>>> Doing task of Tab 1");
    }
}
