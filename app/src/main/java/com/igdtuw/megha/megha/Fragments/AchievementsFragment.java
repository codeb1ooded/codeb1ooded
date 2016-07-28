package com.igdtuw.megha.megha.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.igdtuw.megha.megha.Adapters.AchievementAdapter;
import com.igdtuw.megha.megha.R;

/**
 * Created by megha on 10/7/16.
 */
public class AchievementsFragment extends Fragment {

    ViewPager achievementsViewPager;
    private FragmentStatePagerAdapter fragmentStatePagerAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.achievements_fragment, container, false);
        fragmentStatePagerAdapter = new AchievementAdapter(getActivity(), getChildFragmentManager());
        achievementsViewPager = (ViewPager) view.findViewById(R.id.containerAchievementsFragment);
        achievementsViewPager.setAdapter(fragmentStatePagerAdapter);
        return view;
    }

    public static class AchievementIndividualFragment extends Fragment{

        public static final String ARG_SECTION_NUMBER = "section_number";

        public AchievementIndividualFragment(){
        }

        public static AchievementIndividualFragment newInstance(int sectionNumber) {
            AchievementIndividualFragment fragment = new AchievementIndividualFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            int section_num = getArguments().getInt(ARG_SECTION_NUMBER);
            View view = inflater.inflate(R.layout.fragment_achievement_individual, container, false);
            TextView titleTextView = (TextView) view.findViewById(R.id.individualAchivementTitle);
            TextView textView = (TextView) view.findViewById(R.id.individualAchivementText);
            TextView lastTextView = (TextView) view.findViewById(R.id.individualAchivementOrganizer);
            if(section_num == 1) {
                titleTextView.setText("Aziz Premji Award");
                textView.setText("Awarded Aziz Premji Award by Vivekanand School at Fragrance 2013-14 for displaying excellence in the field of IT");
                lastTextView.setText("-Vivekanad School");
            }
            else if(section_num == 2) {
                titleTextView.setText("CodeDiva");
                textView.setText("I secured second position in a coding competition held by CSI-IGDTUW in association with HackerRank");
                lastTextView.setText("-IGDTUW");
            }
            else if(section_num == 3) {
                titleTextView.setText("Crytocodz");
                textView.setText("Secured first position in Cryptocodz-14 and second position in Cryptocodz-13, held under Annual Cyber Celebration, Technowiz by Vivekanand Schhol");
                lastTextView.setText("-Vivekanand School");
            }
            else {
                titleTextView.setText("Mass Awareness Campaign");
                textView.setText("Certificate of Special Effort and Silver Medal by Care Promise Welfare Society for participating as volunteer in Mass Awareness Campaign against Cancer/ Hepatitis-B");
                lastTextView.setText("-Care Promise Welfare Society");
            }
            return view;
        }
    }

}
