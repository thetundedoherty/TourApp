package com.example.user.tourapp;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity  {
    //This is our viewPager
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Initializing the tab layout
        TabLayout  tabLayout = (TabLayout) findViewById(R.id.tablayout);

        // Create a new Tab named "North Central"
        TabLayout.Tab northCentralTab = tabLayout.newTab();
        // set the Text for the first Tab
        northCentralTab.setText("North Central");
        // add  the tab at in the TabLayout
        tabLayout.addTab(northCentralTab);

        // Create a new Tab named "North West"
        TabLayout.Tab northWestTab = tabLayout.newTab();
        // set the Text for the first Tab
        northWestTab.setText("North West");
        // add  the tab at in the TabLayout
        tabLayout.addTab(northWestTab);

        // Create a new Tab named "North East"
        TabLayout.Tab northEastTab = tabLayout.newTab();
        // set the Text for the first Tab
        northEastTab.setText("North East");
        // add  the tab at in the TabLayout
        tabLayout.addTab(northEastTab);

        // Create a new Tab named "South West"
        TabLayout.Tab southWestTab = tabLayout.newTab();
        // set the Text for the first Tab
        southWestTab.setText("South West");
        // add  the tab at in the TabLayout
        tabLayout.addTab(southWestTab);

        // Create a new Tab named "South East"
        TabLayout.Tab southEastTab = tabLayout.newTab();
        // set the Text for the first Tab
        southEastTab.setText("South East");
        // add  the tab at in the TabLayout
        tabLayout.addTab(southEastTab);

        // Create a new Tab named "South South"
        TabLayout.Tab southSouthTab = tabLayout.newTab();
        // set the Text for the first Tab
        southSouthTab.setText("South South");
        // add  the tab at in the TabLayout
        tabLayout.addTab(southSouthTab);

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        TourCategoryFragmentPagerAdapter adapter = new TourCategoryFragmentPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        }


    }


