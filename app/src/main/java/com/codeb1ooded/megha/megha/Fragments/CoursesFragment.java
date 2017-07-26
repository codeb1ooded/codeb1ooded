package com.codeb1ooded.megha.megha.Fragments;

import android.content.Context;
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
import android.widget.TextView;
import android.widget.Toast;

import com.codeb1ooded.megha.megha.Adapters.CourseAdapter;
import com.codeb1ooded.megha.megha.Constants.Constants;
import com.codeb1ooded.megha.megha.R;

/**
 * Created by megha on 10/7/16.
 */
public class CoursesFragment extends Fragment implements Constants {

    public static final String ARG_SECTION_NUMBER = "section_number";
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

            @Override public void onTabUnselected(TabLayout.Tab tab) {}
            @Override public void onTabReselected(TabLayout.Tab tab) {}
        });

        return view;
    }

    public static class CoursesIndividualFragment extends Fragment{

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
                view = inflater.inflate(R.layout.external_classroom_course_fragment, container, false);
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.external_course_recycler_view);
                CourseRecyclerAdapter adapter = new CourseRecyclerAdapter(getActivity(), EXTERNAL_CLASSROOM_NAME, EXTERNAL_CLASSROOM_SUBNAME);
                recyclerView.setAdapter(adapter);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            }
            return view;
        }
    }

    public static class CourseRecyclerAdapter extends  RecyclerView.Adapter<CourseRecyclerViewHolder> {

        String name[];
        String subText[];
        Context context;
        LayoutInflater inflater;

        public CourseRecyclerAdapter(Context context, String name[], String subText[]) {
            this.name = name;
            this.subText = subText;
            this.context=context;
            inflater=LayoutInflater.from(context);
        }
        @Override
        public CourseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = inflater.inflate(R.layout.utility_item_list, parent, false);
            CourseRecyclerViewHolder viewHolder = new CourseRecyclerViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(CourseRecyclerViewHolder holder, final int position) {

            holder.tv1.setText(name[position]);
            holder.tv2.setText(subText[position]);
            holder.tv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "subText is:"+subText[position], Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return name.length;
        }

    }

    public static class CourseRecyclerViewHolder extends RecyclerView.ViewHolder {

        public TextView tv1,tv2;

        public CourseRecyclerViewHolder(View itemView) {
            super(itemView);
            tv1 = (TextView) itemView.findViewById(R.id.list_title);
            tv2 = (TextView) itemView.findViewById(R.id.list_desc);
        }
    }


}
