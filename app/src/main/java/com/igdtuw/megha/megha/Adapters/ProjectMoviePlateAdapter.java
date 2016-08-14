package com.igdtuw.megha.megha.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.igdtuw.megha.megha.Activities.Project.MoviePlate;

/**
 * Created by megha on 28/7/16.
 */
public class ProjectMoviePlateAdapter extends FragmentStatePagerAdapter {
    int numOfScreens;
    public ProjectMoviePlateAdapter(FragmentManager fm) {
        super(fm);
        numOfScreens = 11;
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
