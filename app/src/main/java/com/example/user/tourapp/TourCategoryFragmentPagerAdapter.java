package com.example.user.tourapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by USER on 6/2/2017.
 */

public class TourCategoryFragmentPagerAdapter extends FragmentStatePagerAdapter {
private int nTabCount;

    public TourCategoryFragmentPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
    this.nTabCount= tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                NorthCentralFragment tab1 = new NorthCentralFragment();
                return tab1;
            case 1:
                NorthWestFragment tab2 = new NorthWestFragment();
                return tab2;
            case 2:
                NorthEastFragment tab3 = new NorthEastFragment();
                return tab3;

            case 3:
                SouthWestFragment tab4 = new SouthWestFragment();
                return tab4;

            case 4:
                SouthEastFragment tab5 = new SouthEastFragment();
                return tab5;

            case 5:
                SouthSouthFragment tab6 = new SouthSouthFragment();
                return tab6;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return nTabCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }


}








