package com.igdtuw.megha.megha.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.igdtuw.megha.megha.Activities.Project.RTIManagementSystem;

/**
 * Created by megha on 28/7/16.
 */
public class ProjectRTIAdapter extends FragmentStatePagerAdapter {
    private int numofScreens;
    public ProjectRTIAdapter(FragmentManager fm) {
        super(fm);
        numofScreens = 0;
    }

    @Override
    public Fragment getItem(int position) {
        return RTIManagementSystem.ProjectIndividualFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return numofScreens;
    }
}
