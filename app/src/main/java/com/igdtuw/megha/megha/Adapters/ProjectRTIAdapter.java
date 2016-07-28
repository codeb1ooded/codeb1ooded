package com.igdtuw.megha.megha.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by megha on 28/7/16.
 */
public class ProjectRTIAdapter extends FragmentStatePagerAdapter {
    Context context = null;
    private int numofScreens;
    public ProjectRTIAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        numofScreens = 0;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return numofScreens;
    }
}
