package com.igdtuw.megha.megha.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.igdtuw.megha.megha.Constants;
import com.igdtuw.megha.megha.Fragments.TechnicalSkillsFragment;

/**
 * Created by megha on 27/7/16.
 */
public class SkillsAdapter extends FragmentStatePagerAdapter implements Constants {
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
            return SKILL_ANDROID;
        else if(position == 1)
            return  SKILL_GIT_GITHUB;
        else if(position == 2)
            return  SKILL_ALGORITHM;
        else if(position == 3)
            return  SKILL_DATABASES;
        else if(position == 4)
            return  SKILL_LINUX;
        else if(position == 5)
            return  SKILL_PYTHON_DJANGO;
        else if(position == 6)
            return  SKILL_PHP_XAMPP;
        else if(position == 7)
            return  SKILL_JAVA;
        else if(position == 8)
            return  SKILL_C_CPP;
        else if(position == 9)
            return  SKILL_ETHICAL_HACKING;
        return  SKILL_HTML_CSS_JS;
    }

    @Override
    public int getCount() {
        return numofScreens;
    }
}
