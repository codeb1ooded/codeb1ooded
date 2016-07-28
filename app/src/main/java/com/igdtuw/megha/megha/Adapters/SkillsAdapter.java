package com.igdtuw.megha.megha.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.igdtuw.megha.megha.Fragments.TechnicalSkillsFragment;

/**
 * Created by megha on 27/7/16.
 */
public class SkillsAdapter extends FragmentStatePagerAdapter {
    Context context = null;
    private int numofScreens;
    public SkillsAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        numofScreens = 11;
    }

    @Override
    public Fragment getItem(int position) {
        return TechnicalSkillsFragment.SkillsIndividualFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
            return "Android";
        else if(position == 1)
            return  "Git & Github";
        else if(position == 2)
            return  "Algorithm";
        else if(position == 3)
            return  "Databases";
        else if(position == 4)
            return  "Linux";
        else if(position == 5)
            return  "Python & Django";
        else if(position == 6)
            return  "PHP & Xampp";
        else if(position == 7)
            return  "Java";
        else if(position == 8)
            return  "C/C++";
        else if(position == 9)
            return  "Ehtical Hacking";
        return  "HTML, CSS & JS";
    }

    @Override
    public int getCount() {
        return numofScreens;
    }
}
