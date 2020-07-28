package com.codeb1ooded.megha.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ToxicBakery.viewpager.transforms.CubeOutTransformer;
import com.ToxicBakery.viewpager.transforms.RotateUpTransformer;
import com.codeb1ooded.megha.Constants.Constants;
import com.codeb1ooded.megha.Constants.Counts;
import com.codeb1ooded.megha.R;
import com.codeb1ooded.megha.Constants.SkillsDetails;

/**
 * Created by megha on 10/7/16.
 */
public class TechnicalSkillsFragment extends Fragment implements SkillsDetails{

    public static final String ARG_SECTION_NUMBER = "section_number";

    ViewPager skillsViewPager;
    private FragmentStatePagerAdapter fragmentStatePagerAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.technical_skills_fragment, container, false);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.skill_tab_layout);
        fragmentStatePagerAdapter = new SkillsAdapter(getActivity(), getChildFragmentManager());

        skillsViewPager = (ViewPager) view.findViewById(R.id.containerSkillsFragment);
        skillsViewPager.setAdapter(fragmentStatePagerAdapter);
        tabLayout.setupWithViewPager(skillsViewPager);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab){
                skillsViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
        skillsViewPager.setPageTransformer(true, new RotateUpTransformer());
        TransformerItem transformerItem = new TransformerItem(CubeOutTransformer.class);
        try {
            skillsViewPager.setPageTransformer(true, transformerItem.clazz.newInstance());
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return view;
    }

    public static class SkillsIndividualFragment extends Fragment{

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            int section_num = getArguments().getInt(ARG_SECTION_NUMBER);
            View view = inflater.inflate(R.layout.fragment_technical_skill, container, false);
            TextView titleTextView = (TextView) view.findViewById(R.id.skill_title);
            ImageView imageView = (ImageView) view.findViewById(R.id.skill_image);
            TextView subTitleTextView = (TextView) view.findViewById(R.id.skill_sub_title);
            TextView contentTextView = (TextView) view.findViewById(R.id.skill_content);
            switch (section_num){
                case 1: // Android
                    titleTextView.setText(ANDROID_TITLE);
                    imageView.setImageResource(ANDROID_IMAGE_RESOURCE);
                    subTitleTextView.setText(ANDROID_SUB_TITLE);
                    contentTextView.setText(ANDROID_CONTENT);
                    break;
                case 2: // Git and Github
                    titleTextView.setText(GIT_TITLE);
                    imageView.setImageResource(GIT_IMAGE_RESOURCE);
                    subTitleTextView.setText(GIT_SUB_TITLE);
                    contentTextView.setText(GIT_CONTENT);
                    break;
                case 3: // Algorithm
                    titleTextView.setText(ALGORITHM_TITLE);
                    imageView.setImageResource(ALGORITHM_IMAGE_RESOURCE);
                    subTitleTextView.setText(ALGORITHM_SUB_TITLE);
                    contentTextView.setText(ALGORITHM_CONTENT);
                    break;
                case 4: // Database
                    titleTextView.setText(DATABASES_TITLE);
                    imageView.setImageResource(DATABASES_IMAGE_RESOURCE);
                    subTitleTextView.setText(DATABASES_SUB_TITLE);
                    contentTextView.setText(DATABASES_CONTENT);
                    break;
                case 5: // Linux
                    titleTextView.setText(LINUX_TITLE);
                    imageView.setImageResource(LINUX_IMAGE_RESOURCE);
                    subTitleTextView.setText(LINUX_SUB_TITLE);
                    contentTextView.setText(LINUX_CONTENT);
                    break;
                case 6: // Python and Django
                    titleTextView.setText(PYTHON_TITLE);
                    imageView.setImageResource(PYTHON_IMAGE_RESOURCE);
                    subTitleTextView.setText(PYTHON_SUB_TITLE);
                    contentTextView.setText(PYTHON_CONTENT);
                    break;
                case 7: // PHP and Xampp
                    titleTextView.setText(PHP_TITLE);
                    imageView.setImageResource(PHP_IMAGE_RESOURCE);
                    subTitleTextView.setText(PHP_SUB_TITLE);
                    contentTextView.setText(PHP_CONTENT);
                    break;
                case 8: // Java
                    titleTextView.setText(JAVA_TITLE);
                    imageView.setImageResource(JAVA_IMAGE_RESOURCE);
                    subTitleTextView.setText(JAVA_SUB_TITLE);
                    contentTextView.setText(JAVA_CONTENT);
                    break;
                case 9: // c and C++
                    titleTextView.setText(CPP_TITLE);
                    imageView.setImageResource(CPP_IMAGE_RESOURCE);
                    subTitleTextView.setText(CPP_SUB_TITLE);
                    contentTextView.setText(CPP_CONTENT);
                    break;
                case 10: // Ethical Hacking
                    titleTextView.setText(HACKING_TITLE);
                    imageView.setImageResource(HACKING_IMAGE_RESOURCE);
                    subTitleTextView.setText(HACKING_SUB_TITLE);
                    contentTextView.setText(HACKING_CONTENT);
                    break;
                case 11: // Front end development
                    titleTextView.setText(FRONTEND_TITLE);
                    imageView.setImageResource(FRONTEND_IMAGE_RESOURCE);
                    subTitleTextView.setText(FRONTEND_SUB_TITLE);
                    contentTextView.setText(FRONTEND_CONTENT);
                    break;
            }
            return view;
        }
    }

    public static class SkillsAdapter extends FragmentStatePagerAdapter implements Constants, Counts {

        Context context = null;
        private String[] screenTitles;

        public SkillsAdapter(Context context, FragmentManager fm) {
            super(fm);
            this.context = context;
            screenTitles = new String[] {  ANDROID_TITLE, GIT_TITLE, ALGORITHM_TITLE, DATABASES_TITLE, LINUX_TITLE,
                    PYTHON_TITLE, PHP_TITLE, JAVA_TITLE, CPP_TITLE, HACKING_TITLE,
                    FRONTEND_TITLE};
        }

        @Override
        public Fragment getItem(int position) {
            SkillsIndividualFragment fragment = new SkillsIndividualFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, position + 1);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return screenTitles[position];
        }

        @Override
        public int getCount() {
            return screenTitles.length;
        }
    }

    private static final class TransformerItem {

        final String title;
        final Class<? extends ViewPager.PageTransformer> clazz;

        public TransformerItem(Class<? extends ViewPager.PageTransformer> clazz) {
            this.clazz = clazz;
            title = clazz.getSimpleName();
        }

        @Override
        public String toString() {
            return title;
        }

    }
}
