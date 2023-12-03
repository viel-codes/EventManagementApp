package com.labactivity.eventmanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class EventPackage extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    ViewPagerAdapter myViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_package);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.view_pager);
        myViewPagerAdapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(myViewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
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