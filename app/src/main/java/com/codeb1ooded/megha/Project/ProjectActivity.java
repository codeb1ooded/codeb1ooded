package com.codeb1ooded.megha.Project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.codeb1ooded.megha.Constants.Counts;
import com.codeb1ooded.megha.Constants.URLs;
import com.codeb1ooded.megha.R;
import com.r0adkll.slidr.Slidr;

/**
 * Created by megha on 29/07/17.
 */

public class ProjectActivity extends AppCompatActivity implements URLs, Projects {

    public static final String ARG_IMAGE_RESOURCE_ID = "image_resource_id";
    public static final String INTENT_PROJECT_NAME = "project_name";

    ViewPager projectViewPager;
    private FragmentStatePagerAdapter fragmentStatePagerAdapter;

    private TextView titleTV, descriptionTV, technologiesUsedTV, developersTV, mentorsTV;
    private Button viewGithubButton, viewDemoButton, playStoreButton;

    private ProjectModel projectDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        Slidr.attach(this);

        setTitle(getIntent().getStringExtra(INTENT_PROJECT_NAME));

        createProjectDetails(getIntent().getStringExtra(INTENT_PROJECT_NAME));
        initializeViews();
        setViewValues();
        setButtonListeners();
    }

    private void setButtonListeners() {
        if(projectDetails.getGithubLink() == null){
            viewGithubButton.setVisibility(View.GONE);
        }
        else{
            viewGithubButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(projectDetails.getGithubLink()));
                    startActivity(i);
                }
            });
        }
        if(projectDetails.getDemoLink() == null){
            viewDemoButton.setVisibility(View.GONE);
        }
        else{
            viewDemoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(projectDetails.getDemoLink()));
                    startActivity(i);
                }
            });
        }
        if(projectDetails.getPlaystoreLink() == null){
            playStoreButton.setVisibility(View.GONE);
        }
        else{
            playStoreButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(projectDetails.getPlaystoreLink()));
                    startActivity(i);
                }
            });
        }
    }

    private void setViewValues() {
        titleTV.setText(projectDetails.getProjectName());
        descriptionTV.setText(projectDetails.getProjectDescription());
        technologiesUsedTV.setText(projectDetails.getTechnologiesUsed());
        developersTV.setText(projectDetails.getDevelopers());
        if(projectDetails.getMentors() == null) {
            findViewById(R.id.project_mentors).setVisibility(View.GONE);
            mentorsTV.setVisibility(View.GONE);
        }
        else {
            mentorsTV.setText(projectDetails.getMentors());
        }
    }

    private void createProjectDetails(String stringExtra) {

        switch (stringExtra){
            case RTI_NAME:
                projectDetails = ProjectModel.createEventleyDetails().createRTIDetails();
                break;
            case MOVIEPLATE_NAME:
                projectDetails = ProjectModel.createEventleyDetails().createMoviePlateDetails();
                break;
            case OTHELLO_NAME:
                projectDetails = ProjectModel.createEventleyDetails().createOthelloDetails();
                break;
            case EVENTLEY_NAME:
                projectDetails = ProjectModel.createEventleyDetails().createEventleyDetails();
                break;
            case CALCULATOR_NAME:
                projectDetails = ProjectModel.createEventleyDetails().createCalculatorDetails();
                break;
        }
    }

    private void initializeViews() {
        fragmentStatePagerAdapter = new ProjectAdapter(getSupportFragmentManager(), projectDetails.getImagesArray());
        projectViewPager = (ViewPager) findViewById(R.id.containerProjectFragment);
        projectViewPager.setAdapter(fragmentStatePagerAdapter);

        titleTV = (TextView) findViewById(R.id.project_title);
        descriptionTV = (TextView) findViewById(R.id.project_description);
        technologiesUsedTV = (TextView) findViewById(R.id.project_technologies_used);
        developersTV = (TextView) findViewById(R.id.project_developers);
        mentorsTV = (TextView) findViewById(R.id.project_mentors);

        viewGithubButton = (Button) findViewById(R.id.project_view_github);
        viewDemoButton = (Button) findViewById(R.id.project_view_demo);
        playStoreButton = (Button) findViewById(R.id.project_playstore);
    }

    public static class ProjectIndividualFragment extends Fragment {

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.image_view_project_all, container, false);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageViewProject);
            imageView.setImageResource(getArguments().getInt(ARG_IMAGE_RESOURCE_ID));
            return view;
        }
    }

    public class ProjectAdapter extends FragmentStatePagerAdapter implements Counts {

        private int images[];

        public ProjectAdapter(FragmentManager fm, int images[]) {
            super(fm);
            this.images = images;
        }

        @Override
        public Fragment getItem(int position) {
            ProjectIndividualFragment fragment = new ProjectIndividualFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_IMAGE_RESOURCE_ID, images[position]);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public int getCount() {
            return images.length;
        }
    }
}
