package com.roomra.roomerAndroid.roomerandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class RoomerFragmentAdapter extends FragmentStatePagerAdapter {
    public RoomerFragmentAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new FrontPageMapView();
            case 1:
                // Games fragment activity
                return new FrontPagePosts();
            case 2:
                // Movies fragment activity
                return new FrontPageTopics();
            case 3:
                // Movies fragment activity
                return new FrontPageProf();

        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }
}

// Instances of this class are fragments representing a single
