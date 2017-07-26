package com.codeb1ooded.megha.megha.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.codeb1ooded.megha.megha.Constants.Constants;
import com.codeb1ooded.megha.megha.Constants.Counts;
import com.codeb1ooded.megha.megha.R;

import github.chenupt.springindicator.SpringIndicator;

/**
 * Created by megha on 10/7/16.
 */
public class AchievementsFragment extends Fragment implements Constants {

    public static final String ARG_SECTION_NUMBER = "section_number";

    ViewPager achievementsViewPager;
    private FragmentStatePagerAdapter fragmentStatePagerAdapter;
    SpringIndicator indicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.achievements_fragment, container, false);
        fragmentStatePagerAdapter = new AchievementAdapter(getActivity(), getChildFragmentManager());
        indicator = (SpringIndicator) view.findViewById(R.id.bulletIndicator);
        achievementsViewPager = (ViewPager) view.findViewById(R.id.containerAchievementsFragment);
        achievementsViewPager.setAdapter(fragmentStatePagerAdapter);
        indicator.setViewPager(achievementsViewPager);
        return view;
    }

    public static class AchievementAdapter extends FragmentStatePagerAdapter implements Counts {
        Context context = null;
        private int numOfScreens;

        public AchievementAdapter(Context context, FragmentManager fm) {
            super(fm);
            this.context = context;
            numOfScreens = ACHIEVEMENT_FRAGMENTS;
        }

        @Override
        public Fragment getItem(int position) {
            AchievementsFragment.AchievementIndividualFragment fragment = new AchievementsFragment.AchievementIndividualFragment();
            Bundle args = new Bundle();
            args.putInt(AchievementsFragment.ARG_SECTION_NUMBER, position + 1);
            fragment.setArguments(args);
            return fragment;
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

    public static class AchievementIndividualFragment extends Fragment{

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            int section_num = getArguments().getInt(ARG_SECTION_NUMBER);
            View view = inflater.inflate(R.layout.fragment_achievement_individual, container, false);
            TextView titleTextView = (TextView) view.findViewById(R.id.individualAchivementTitle);
            TextView textView = (TextView) view.findViewById(R.id.individualAchivementText);
            TextView lastTextView = (TextView) view.findViewById(R.id.individualAchivementOrganizer);
            if(section_num == 1) {
                titleTextView.setText(SIH_TITLE);
                textView.setText(SIH_CONTENT);
                lastTextView.setText(SIH_PRESENTER);
            }
            else if(section_num == 2) {
                titleTextView.setText(AZIZ_PREMJI_AWARD_TITLE);
                textView.setText(AZIZ_PREMJI_AWARD_CONTENT);
                lastTextView.setText(AZIZ_PREMJI_AWARD_PRESENTER);
            }
            else if(section_num == 3) {
                titleTextView.setText(CODE_DIVA_TITLE);
                textView.setText(CODE_DIVA_CONTENT);
                lastTextView.setText(CODE_DIVA_PRESENTER);
            }
            else if(section_num == 4) {
                titleTextView.setText(CRYPTOCODZ_TITLE);
                textView.setText(CRYPTOCODZ_CONTENT);
                lastTextView.setText(CRYPTOCODZ_PRESENTER);
            }
            else if(section_num == 5) {
                titleTextView.setText(BUGWARS_TITLE);
                textView.setText(BUGWARS_CONTENT);
                lastTextView.setText(BUGWARS_PRESENTER);
            }
            else if(section_num == 6) {
                titleTextView.setText(CODE_N_COUNTER_TITLE);
                textView.setText(CODE_N_COUNTER_CONTENT);
                lastTextView.setText(CODE_N_COUNTER_PRESENTER);
            }
            else {
                titleTextView.setText(MASS_AWARENESS_CAMPAIGN_TITLE);
                textView.setText(MASS_AWARENESS_CAMPAIGN_CONTENT);
                lastTextView.setText(MASS_AWARENESS_CAMPAIGN_PRESENTER);
            }
            return view;
        }
    }

}
