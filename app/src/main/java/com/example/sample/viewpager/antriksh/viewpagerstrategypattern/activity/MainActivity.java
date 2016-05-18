package com.example.sample.viewpager.antriksh.viewpagerstrategypattern.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.R;
import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.adapter.ViewPagerAdapter;
import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab.ToDoClass;
import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab.impl.Tab1Impl;
import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab.impl.Tab2Impl;
import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab.impl.Tab3Impl;

public class MainActivity extends AppCompatActivity
        implements ViewPager.OnPageChangeListener,
        TabLayout.OnTabSelectedListener {

    private final String TAG = MainActivity.class.getName();

    private ViewPager viewPager;

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupToolBar();

        setUpViewPagerAndTabLayout();

        viewPager.addOnPageChangeListener(this);

        //Adding onTabSelectedListener to swipe views
        tabLayout.setOnTabSelectedListener(this);

        updateCurrentlyVisibleFragment();
    }

    private void updateCurrentlyVisibleFragment() {

        ToDoClass toDoClass = new ToDoClass();

        switch (viewPager.getCurrentItem()) {
            case 0:
                toDoClass.setTask(new Tab1Impl());
                break;
            case 1:
                toDoClass.setTask(new Tab2Impl());
                break;
            case 2:
                toDoClass.setTask(new Tab3Impl());
                break;
            default:
                toDoClass.setTask(new Tab1Impl());
                break;
        }

        toDoClass.selectTabForToDoTask();
    }

    private void setupToolBar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

    private void setUpViewPagerAndTabLayout() {

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);

        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.tab1)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.tab2)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.tab3)));

        //Creating our pager adapter
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        //Adding adapter to pager
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        Log.d(TAG, ">>>> Page Selected : "+position);
        tabLayout.getTabAt(position).select();
        updateCurrentlyVisibleFragment();
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        Log.d(TAG, ">>>> Tab Selected : "+tab.getPosition());
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }
}
