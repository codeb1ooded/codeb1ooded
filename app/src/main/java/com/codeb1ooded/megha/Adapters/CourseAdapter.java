package com.codeb1ooded.megha.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.codeb1ooded.megha.Constants.Constants;
import com.codeb1ooded.megha.Constants.Counts;
import com.codeb1ooded.megha.Fragments.CoursesFragment;

/**
 * Created by megha on 23/7/16.
 */
public class CourseAdapter extends FragmentStatePagerAdapter implements Constants, Counts {
    Context context = null;
    private int numofScreens;

    public CourseAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        numofScreens = COURSE_FRAGMENTS;
    }

    @Override
    public int getCount() {
        return numofScreens;
    }

    @Override
    public Fragment getItem(int position) {
        CoursesFragment.CoursesIndividualFragment fragment = new CoursesFragment.CoursesIndividualFragment();
        Bundle args = new Bundle();
        args.putInt(CoursesFragment.ARG_SECTION_NUMBER, position + 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
            return ONLINE_COURSES;
        else if(position == 1)
            return  GRADUATE_COURSES;
        return  EXTERNAL_CLASSROOM;
    }

}
