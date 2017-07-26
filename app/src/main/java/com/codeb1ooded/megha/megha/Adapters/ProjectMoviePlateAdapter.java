package com.codeb1ooded.megha.megha.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.codeb1ooded.megha.megha.Activities.Project.MoviePlate;
import com.codeb1ooded.megha.megha.Constants.Counts;

/**
 * Created by megha on 28/7/16.
 */
public class ProjectMoviePlateAdapter extends FragmentStatePagerAdapter implements Counts {
    int numOfScreens;
    public ProjectMoviePlateAdapter(FragmentManager fm) {
        super(fm);
        numOfScreens = PROJECT_MOVIEPLATE_FRAGMENTS;
    }

    @Override
    public Fragment getItem(int position) {
        return MoviePlate.ProjectIndividualFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return 11;
    }
}
