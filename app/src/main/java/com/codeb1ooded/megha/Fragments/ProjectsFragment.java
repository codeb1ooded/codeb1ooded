package com.codeb1ooded.megha.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.codeb1ooded.megha.Project.ProjectActivity;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidviewhover.BlurLayout;
import com.codeb1ooded.megha.Constants.Constants;
import com.codeb1ooded.megha.Project.Projects;
import com.codeb1ooded.megha.Constants.URLs;
import com.codeb1ooded.megha.R;

/**
 * Created by megha on 10/7/16.
 */
public class ProjectsFragment extends Fragment implements Constants, URLs, Projects{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.projects_fragment, container, false);
        setRTIDetails(view);
        setMovieplateDetails(view);
        setOthelloDetails(view);
        setEventleyDetails(view);
        setScientificCalculatorDetails(view);
        return view;
    }

    public void setRTIDetails(View view){
        BlurLayout rtiBlur = (BlurLayout) view.findViewById(R.id.view_hover_rti);
        View hover_rti = LayoutInflater.from(getContext()).inflate(R.layout.hover, null);
        rtiBlur.setHoverView(hover_rti);
        hover_rti.findViewById(R.id.play_store).setVisibility(View.GONE);
        rtiBlur.addChildAppearAnimator(hover_rti, R.id.view_demo_online, Techniques.FlipInX);
        rtiBlur.addChildDisappearAnimator(hover_rti, R.id.view_demo_online, Techniques.FlipOutX);
        rtiBlur.addChildAppearAnimator(hover_rti, R.id.github, Techniques.FlipInX);
        rtiBlur.addChildDisappearAnimator(hover_rti, R.id.github, Techniques.FlipOutX);
        rtiBlur.addChildAppearAnimator(hover_rti, R.id.view_more, Techniques.FlipInX);
        rtiBlur.addChildDisappearAnimator(hover_rti, R.id.view_more, Techniques.FlipOutX);
        TextView rtiTextView = (TextView) hover_rti.findViewById(R.id.hover_text_view);
        rtiTextView.setText(RTI_NAME);
        hover_rti.findViewById(R.id.view_more).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getActivity(), ProjectActivity.class);
                i.putExtra(ProjectActivity.INTENT_PROJECT_NAME, RTI_NAME);
                startActivity(i);
            }
        });
        hover_rti.findViewById(R.id.github).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(RTI_GITHUB_LINK));
                startActivity(i);
            }
        });
        hover_rti.findViewById(R.id.view_demo_online).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(RTI_DEMO_LINK));
                startActivity(i);
            }
        });
    }

    public void setMovieplateDetails(View view){
        BlurLayout movieplateBlur = (BlurLayout) view.findViewById(R.id.view_hover_movieplate);
        View hover_movieplate = LayoutInflater.from(getContext()).inflate(R.layout.hover, null);
        movieplateBlur.setHoverView(hover_movieplate);
        hover_movieplate.findViewById(R.id.play_store).setVisibility(View.GONE);
        hover_movieplate.findViewById(R.id.view_demo_online).setVisibility(View.GONE);
        movieplateBlur.addChildAppearAnimator(hover_movieplate, R.id.github, Techniques.FlipInX);
        movieplateBlur.addChildDisappearAnimator(hover_movieplate, R.id.github, Techniques.FlipOutX);
        movieplateBlur.addChildAppearAnimator(hover_movieplate, R.id.view_more, Techniques.FlipInX);
        movieplateBlur.addChildDisappearAnimator(hover_movieplate, R.id.view_more, Techniques.FlipOutX);
        TextView movieplateTextView = (TextView) hover_movieplate.findViewById(R.id.hover_text_view);
        movieplateTextView.setText(MOVIEPLATE_NAME);
        hover_movieplate.findViewById(R.id.view_more).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getActivity(), ProjectActivity.class);
                i.putExtra(ProjectActivity.INTENT_PROJECT_NAME, MOVIEPLATE_NAME);
                startActivity(i);
            }
        });
        hover_movieplate.findViewById(R.id.github).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(MOVIEPLATE_GITHUB_LINK));
                startActivity(i);
            }
        });
    }

    public void setOthelloDetails(View view){
        BlurLayout othelloBlur = (BlurLayout) view.findViewById(R.id.view_hover_othello);
        View hover_othello = LayoutInflater.from(getContext()).inflate(R.layout.hover, null);
        othelloBlur.setHoverView(hover_othello);
        hover_othello.findViewById(R.id.play_store).setVisibility(View.GONE);
        hover_othello.findViewById(R.id.view_demo_online).setVisibility(View.GONE);
        othelloBlur.addChildAppearAnimator(hover_othello, R.id.github, Techniques.FlipInX);
        othelloBlur.addChildDisappearAnimator(hover_othello, R.id.github, Techniques.FlipOutX);
        othelloBlur.addChildAppearAnimator(hover_othello, R.id.view_more, Techniques.FlipInX);
        othelloBlur.addChildDisappearAnimator(hover_othello, R.id.view_more, Techniques.FlipOutX);
        TextView othelloTextView = (TextView) hover_othello.findViewById(R.id.hover_text_view);
        othelloTextView.setText(OTHELLO_NAME);
        hover_othello.findViewById(R.id.view_more).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getActivity(), ProjectActivity.class);
                i.putExtra(ProjectActivity.INTENT_PROJECT_NAME, OTHELLO_NAME);
                startActivity(i);
            }
        });
        hover_othello.findViewById(R.id.github).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(OTHELLO_GITHUB_LINK));
                startActivity(i);
            }
        });
    }

    public void setEventleyDetails(View view){
        BlurLayout eventleyBlur = (BlurLayout) view.findViewById(R.id.view_hover_eventley);
        View hover_eventley = LayoutInflater.from(getContext()).inflate(R.layout.hover, null);
        eventleyBlur.setHoverView(hover_eventley);
        hover_eventley.findViewById(R.id.play_store).setVisibility(View.GONE);
        hover_eventley.findViewById(R.id.view_demo_online).setVisibility(View.GONE);
        eventleyBlur.addChildAppearAnimator(hover_eventley, R.id.view_demo_online, Techniques.FlipInX);
        eventleyBlur.addChildDisappearAnimator(hover_eventley, R.id.view_demo_online, Techniques.FlipOutX);
        eventleyBlur.addChildAppearAnimator(hover_eventley, R.id.github, Techniques.FlipInX);
        eventleyBlur.addChildDisappearAnimator(hover_eventley, R.id.github, Techniques.FlipOutX);
        eventleyBlur.addChildAppearAnimator(hover_eventley, R.id.view_more, Techniques.FlipInX);
        eventleyBlur.addChildDisappearAnimator(hover_eventley, R.id.view_more, Techniques.FlipOutX);
        TextView eventleyTextView = (TextView) hover_eventley.findViewById(R.id.hover_text_view);
        eventleyTextView.setText(EVENTLEY_NAME);
        hover_eventley.findViewById(R.id.view_more).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getActivity(), ProjectActivity.class);
                i.putExtra(ProjectActivity.INTENT_PROJECT_NAME, EVENTLEY_NAME);
                startActivity(i);
            }
        });
        hover_eventley.findViewById(R.id.github).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(EVENTLEY_GITHUB_LINK));
                startActivity(i);
            }
        });
        hover_eventley.findViewById(R.id.view_demo_online).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(EVENTLEY_DEMO_LINK));
                startActivity(i);
            }
        });
    }

    public void setScientificCalculatorDetails(View view){
        BlurLayout scienificCalculatorBlur = (BlurLayout) view.findViewById(R.id.view_hover_scientific_calculator);
        View hover_scientific_calculator = LayoutInflater.from(getContext()).inflate(R.layout.hover, null);
        scienificCalculatorBlur.setHoverView(hover_scientific_calculator);
        hover_scientific_calculator.findViewById(R.id.view_demo_online).setVisibility(View.GONE);
        scienificCalculatorBlur.addChildAppearAnimator(hover_scientific_calculator, R.id.github, Techniques.FlipInX);
        scienificCalculatorBlur.addChildDisappearAnimator(hover_scientific_calculator, R.id.github, Techniques.FlipOutX);
        scienificCalculatorBlur.addChildAppearAnimator(hover_scientific_calculator, R.id.play_store, Techniques.FlipInX);
        scienificCalculatorBlur.addChildDisappearAnimator(hover_scientific_calculator, R.id.play_store, Techniques.FlipOutX);
        scienificCalculatorBlur.addChildAppearAnimator(hover_scientific_calculator, R.id.view_more, Techniques.FlipInX);
        scienificCalculatorBlur.addChildDisappearAnimator(hover_scientific_calculator, R.id.view_more, Techniques.FlipOutX);
        TextView scientificCalculatorTextView = (TextView) hover_scientific_calculator.findViewById(R.id.hover_text_view);
        scientificCalculatorTextView.setText(CALCULATOR_NAME);
        hover_scientific_calculator.findViewById(R.id.view_more).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getActivity(), ProjectActivity.class);
                i.putExtra(ProjectActivity.INTENT_PROJECT_NAME, CALCULATOR_NAME);
                startActivity(i);
            }
        });
        hover_scientific_calculator.findViewById(R.id.play_store).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(CALCULATOR_PLAYSTORE_LINK));
                startActivity(i);
            }
        });
        hover_scientific_calculator.findViewById(R.id.github).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(CALCULATOR_GITHUB_LINK));
                startActivity(i);
            }
        });
    }


}
