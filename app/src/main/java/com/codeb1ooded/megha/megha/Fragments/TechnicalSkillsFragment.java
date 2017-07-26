package com.codeb1ooded.megha.megha.Fragments;

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

import com.ToxicBakery.viewpager.transforms.CubeOutTransformer;
import com.ToxicBakery.viewpager.transforms.RotateUpTransformer;
import com.codeb1ooded.megha.megha.Constants.Constants;
import com.codeb1ooded.megha.megha.Constants.Counts;
import com.codeb1ooded.megha.megha.R;

/**
 * Created by megha on 10/7/16.
 */
public class TechnicalSkillsFragment extends Fragment {

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
            View view;
            if(section_num == 1)
                view = inflater.inflate(R.layout.fragment_skills_android, container, false);
            else if(section_num == 2)
                view = inflater.inflate(R.layout.fragment_skills_gitngithub, container, false);
            else if(section_num == 3)
                view = inflater.inflate(R.layout.fragment_skills_algorithm, container, false);
            else if(section_num == 4)
                view = inflater.inflate(R.layout.fragment_skills_databases, container, false);
            else if(section_num == 5)
                view = inflater.inflate(R.layout.fragment_skills_linux, container, false);
            else if(section_num == 6)
                view = inflater.inflate(R.layout.fragment_skills_pyhtonndjango, container, false);
            else if(section_num == 7)
                view = inflater.inflate(R.layout.fragment_skills_phpnxampp, container, false);
            else if(section_num == 8)
                view = inflater.inflate(R.layout.fragment_skills_java, container, false);
            else if(section_num == 9)
                view = inflater.inflate(R.layout.fragment_skills_cncpp, container, false);
            else if(section_num == 10)
                view = inflater.inflate(R.layout.fragment_skills_ehacking, container, false);
            else
                view = inflater.inflate(R.layout.fragment_skills_htmlcssjs, container, false);
            return view;
        }
    }

    public static class SkillsAdapter extends FragmentStatePagerAdapter implements Constants, Counts {

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
            return numofScreens;
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
