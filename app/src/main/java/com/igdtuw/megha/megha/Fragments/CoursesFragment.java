package com.igdtuw.megha.megha.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.igdtuw.megha.megha.Adapters.CourseAdapter;
import com.igdtuw.megha.megha.Adapters.CourseRecyclerAdapter;
import com.igdtuw.megha.megha.Constants.Constants;
import com.igdtuw.megha.megha.R;

/**
 * Created by megha on 10/7/16.
 */
public class CoursesFragment extends Fragment implements Constants {
    ViewPager coursesViewPager;
    private FragmentStatePagerAdapter fragmentStatePagerAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.courses_fragment, container, false);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.course_tab_layout);
        fragmentStatePagerAdapter = new CourseAdapter(getActivity(), getChildFragmentManager());
        coursesViewPager = (ViewPager) view.findViewById(R.id.containerCoursesFragment);
        coursesViewPager.setAdapter(fragmentStatePagerAdapter);
        tabLayout.setupWithViewPager(coursesViewPager);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab){
                coursesViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }

    public static class CoursesIndividualFragment extends Fragment{

        public static final String ARG_SECTION_NUMBER = "section_number";

        public CoursesIndividualFragment(){
        }

        public static CoursesIndividualFragment newInstance(int sectionNumber) {
            CoursesIndividualFragment fragment = new CoursesIndividualFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            int section_num = getArguments().getInt(ARG_SECTION_NUMBER);
            View view;
            if(section_num == 1){
                view = inflater.inflate(R.layout.online_course_fragment, container, false);
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.online_course_recycler_view);
                CourseRecyclerAdapter adapter = new CourseRecyclerAdapter(getActivity(), ONLINE_COURSE_NAME, ONLINE_COURSE_SUBNAME);
                recyclerView.setAdapter(adapter);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            }
            else if(section_num == 2){
                view = inflater.inflate(R.layout.graduate_course_fragment, container, false);
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.graduate_course_recycler_view);
                CourseRecyclerAdapter adapter = new CourseRecyclerAdapter(getActivity(), GRADUATE_COURSE_NAME, GRADUATE_COURSE_SUBNAME);
                recyclerView.setAdapter(adapter);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            }
            else{
                view = inflater.inflate(R.layout.exteranal_classroom_course_fragment, container, false);
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.external_course_recycler_view);
                CourseRecyclerAdapter adapter = new CourseRecyclerAdapter(getActivity(), EXTERNAL_CLASSROOM_NAME, EXTERNAL_CLASSROOM_SUBNAME);
                recyclerView.setAdapter(adapter);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            }
            return view;
        }
    }
}
