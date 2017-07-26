package com.codeb1ooded.megha.megha.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.codeb1ooded.megha.megha.Constants.Constants;
import com.codeb1ooded.megha.megha.Constants.Counts;
import com.codeb1ooded.megha.megha.Fragments.TechnicalSkillsFragment;

/**
 * Created by megha on 27/7/16.
 */
public class SkillsAdapter extends FragmentStatePagerAdapter implements Constants, Counts {

    Context context = null;
    private int numofScreens;
    private String[] screenTitles;

    public SkillsAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        numofScreens = SKILL_FRAGMENTS;
        screenTitles = new String[] {  SKILL_ANDROID, SKILL_GIT_GITHUB, SKILL_ALGORITHM, SKILL_DATABASES, SKILL_LINUX,
                                        SKILL_PYTHON_DJANGO, SKILL_PHP_XAMPP, SKILL_JAVA, SKILL_C_CPP, SKILL_ETHICAL_HACKING,
                                        SKILL_HTML_CSS_JS};
    }

    @Override
    public Fragment getItem(int position) {
        return TechnicalSkillsFragment.SkillsIndividualFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return screenTitles[position];
    }

    @Override
    public int getCount() {
        return numofScreens;
    }
}
