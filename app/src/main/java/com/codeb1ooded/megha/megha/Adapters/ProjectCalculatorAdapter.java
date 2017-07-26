package com.codeb1ooded.megha.megha.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.codeb1ooded.megha.megha.Activities.Project.ScientficCalculator;
import com.codeb1ooded.megha.megha.Constants.Counts;

/**
 * Created by megha on 28/7/16.
 */
public class ProjectCalculatorAdapter extends FragmentStatePagerAdapter implements Counts{
    private int numofScreens;
    public ProjectCalculatorAdapter(FragmentManager fm) {
        super(fm);
        numofScreens = PROJECT_CALCULATOR_FRAGMENTS;
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
