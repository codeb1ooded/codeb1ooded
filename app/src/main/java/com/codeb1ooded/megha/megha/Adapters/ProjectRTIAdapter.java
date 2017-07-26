package com.codeb1ooded.megha.megha.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.codeb1ooded.megha.megha.Activities.Project.RTIManagementSystem;
import com.codeb1ooded.megha.megha.Constants.Counts;

/**
 * Created by megha on 28/7/16.
 */
public class ProjectRTIAdapter extends FragmentStatePagerAdapter implements Counts {
    private int numofScreens;
    public ProjectRTIAdapter(FragmentManager fm) {
        super(fm);
        numofScreens = PROJECT_RTI_FRAGMENTS;
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
