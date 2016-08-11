package com.igdtuw.megha.megha.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.igdtuw.megha.megha.Activities.Project.OthelloBoardGame;

/**
 * Created by megha on 28/7/16.
 */
public class ProjectOthelloAdapter extends FragmentStatePagerAdapter {
    private int numofScreens;
    public ProjectOthelloAdapter(FragmentManager fm) {
        super(fm);
        numofScreens = 4;
    }

    @Override
    public Fragment getItem(int position) {
        return OthelloBoardGame.ProjectIndividualFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return numofScreens;
    }
}
