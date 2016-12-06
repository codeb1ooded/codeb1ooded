package com.igdtuw.megha.megha.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.igdtuw.megha.megha.Fragments.AchievementsFragment;

/**
 * Created by megha on 27/7/16.
 */
public class AchievementAdapter extends FragmentStatePagerAdapter {
    Context context = null;
    private int numofScreens;

    public AchievementAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        numofScreens = 6;
    }

    @Override
    public Fragment getItem(int position) {
        return AchievementsFragment.AchievementIndividualFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return numofScreens;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
            return "1";
        else if(position == 1)
            return  "2";
        else if(position == 2)
            return  "3";
        else if(position == 3)
            return  "4";
        else if(position == 4)
            return  "5";
        return  "6";
    }
}
