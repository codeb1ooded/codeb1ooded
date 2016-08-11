package com.igdtuw.megha.megha.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.igdtuw.megha.megha.Activities.Project.ScientficCalculator;

/**
 * Created by megha on 28/7/16.
 */
public class ProjectCalculatorAdapter extends FragmentStatePagerAdapter {
    private int numofScreens;
    public ProjectCalculatorAdapter(FragmentManager fm) {
        super(fm);
        numofScreens = 7;
    }

    @Override
    public Fragment getItem(int position) {
        return ScientficCalculator.ProjectIndividualFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return numofScreens;
    }
}
