package com.codeb1ooded.megha.megha.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.codeb1ooded.megha.megha.Activities.Project.Eventley;
import com.codeb1ooded.megha.megha.Constants.Counts;

/**
 * Created by megha on 28/7/16.
 */
public class ProjectEventleyAdapter extends FragmentStatePagerAdapter implements Counts{
    private int numofScreens;
    public ProjectEventleyAdapter(FragmentManager fm) {
        super(fm);
        numofScreens = PROJECT_EVENTLEY_FRAGMENTS;
    }

    @Override
    public Fragment getItem(int position) {
        return Eventley.ProjectIndividualFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return numofScreens;
    }
}
