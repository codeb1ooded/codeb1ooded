package com.codeb1ooded.megha.megha.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.codeb1ooded.megha.megha.Constants.Counts;
import com.codeb1ooded.megha.megha.Fragments.AchievementsFragment;

/**
 * Created by megha on 27/7/16.
 */
public class AchievementAdapter extends FragmentStatePagerAdapter implements Counts{
    Context context = null;
    private int numOfScreens;

    public AchievementAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        numOfScreens = ACHIEVEMENT_FRAGMENTS;
    }

    @Override
    public Fragment getItem(int position) {
        return AchievementsFragment.AchievementIndividualFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return numOfScreens;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return position + 1 + "";
    }
}
