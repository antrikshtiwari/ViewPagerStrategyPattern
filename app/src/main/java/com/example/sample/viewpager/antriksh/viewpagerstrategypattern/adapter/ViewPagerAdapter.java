package com.example.sample.viewpager.antriksh.viewpagerstrategypattern.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab.Tab;
import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab.Tab1;
import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab.Tab2;
import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab.Tab3;

/**
 * Created by antrikshtiwari on 14/05/16.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    int mTabCount;

    public ViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.mTabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                Tab tab1 = new Tab1();
                return tab1;
            case 1:
                Tab tab2 = new Tab2();
                return tab2;
            case 2:
                Tab tab3 = new Tab3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mTabCount;
    }
}
