package com.igdtuw.megha.megha.Activities.Project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.igdtuw.megha.megha.Adapters.ProjectOthelloAdapter;
import com.igdtuw.megha.megha.R;

/**
 * Created by megha on 27/7/16.
 */
public class OthelloBoardGame extends AppCompatActivity {

    ViewPager projectViewPager;
    private FragmentStatePagerAdapter fragmentStatePagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_othello);
        fragmentStatePagerAdapter = new ProjectOthelloAdapter(getSupportFragmentManager());
        projectViewPager = (ViewPager) findViewById(R.id.containerProjectOthelloFragment);
        projectViewPager.setAdapter(fragmentStatePagerAdapter);
    }

    public void showDemo(View v){
        String url = "put correct url";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void showGithub(View v){
        String url = "https://github.com/codeb1ooded/Othello";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public static class ProjectIndividualFragment extends Fragment {

        public static final String ARG_SECTION_NUMBER = "section_number";

        public ProjectIndividualFragment(){
        }

        public static ProjectIndividualFragment newInstance(int sectionNumber) {
            ProjectIndividualFragment fragment = new ProjectIndividualFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            int section_num = getArguments().getInt(ARG_SECTION_NUMBER);
            View view = inflater.inflate(R.layout.image_view_project_all, container, false);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageViewProject);
            if(section_num == 1)
                imageView.setImageResource(R.drawable.project_othello1);
            else if(section_num == 2)
                imageView.setImageResource(R.drawable.project_othello2);
            else if(section_num == 3)
                imageView.setImageResource(R.drawable.project_othello3);
            else
                imageView.setImageResource(R.drawable.project_othello4);
            return view;
        }
    }
}
