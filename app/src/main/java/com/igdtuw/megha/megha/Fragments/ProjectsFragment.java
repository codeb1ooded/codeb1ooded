package com.igdtuw.megha.megha.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidviewhover.BlurLayout;
import com.igdtuw.megha.megha.Activities.Project.Eventley;
import com.igdtuw.megha.megha.Activities.Project.MoviePlate;
import com.igdtuw.megha.megha.Activities.Project.OthelloBoardGame;
import com.igdtuw.megha.megha.Activities.Project.RTIManagementSystem;
import com.igdtuw.megha.megha.Activities.Project.ScientficCalculator;
import com.igdtuw.megha.megha.Constants;
import com.igdtuw.megha.megha.R;

/**
 * Created by megha on 10/7/16.
 */
public class ProjectsFragment extends Fragment implements Constants{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.projects_fragment, container, false);

        BlurLayout rtiBlur = (BlurLayout) view.findViewById(R.id.view_hover_rti);
        View hover_rti = LayoutInflater.from(getContext()).inflate(R.layout.hover, null);
        rtiBlur.setHoverView(hover_rti);
        rtiBlur.addChildAppearAnimator(hover_rti, R.id.heart, Techniques.FlipInX);
        rtiBlur.addChildDisappearAnimator(hover_rti, R.id.heart, Techniques.FlipOutX);
        rtiBlur.addChildAppearAnimator(hover_rti, R.id.share, Techniques.FlipInX);
        rtiBlur.addChildDisappearAnimator(hover_rti, R.id.share, Techniques.FlipOutX);
        rtiBlur.addChildAppearAnimator(hover_rti, R.id.github, Techniques.FlipInX);
        rtiBlur.addChildDisappearAnimator(hover_rti, R.id.github, Techniques.FlipOutX);
        rtiBlur.addChildAppearAnimator(hover_rti, R.id.view_more, Techniques.FlipInX);
        rtiBlur.addChildDisappearAnimator(hover_rti, R.id.view_more, Techniques.FlipOutX);
        hover_rti.findViewById(R.id.view_more).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getActivity(), RTIManagementSystem.class);
                startActivity(i);
            }
        });
        hover_rti.findViewById(R.id.github).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(RTI_GITHUB_URL));
                startActivity(i);
            }
        });

        BlurLayout movieplateBlur = (BlurLayout) view.findViewById(R.id.view_hover_movieplate);
        View hover_movieplate = LayoutInflater.from(getContext()).inflate(R.layout.hover, null);
        movieplateBlur.setHoverView(hover_movieplate);
        movieplateBlur.addChildAppearAnimator(hover_movieplate, R.id.heart, Techniques.FlipInX);
        movieplateBlur.addChildDisappearAnimator(hover_movieplate, R.id.heart, Techniques.FlipOutX);
        movieplateBlur.addChildAppearAnimator(hover_movieplate, R.id.share, Techniques.FlipInX);
        movieplateBlur.addChildDisappearAnimator(hover_movieplate, R.id.share, Techniques.FlipOutX);
        movieplateBlur.addChildAppearAnimator(hover_movieplate, R.id.github, Techniques.FlipInX);
        movieplateBlur.addChildDisappearAnimator(hover_movieplate, R.id.github, Techniques.FlipOutX);
        movieplateBlur.addChildAppearAnimator(hover_movieplate, R.id.view_more, Techniques.FlipInX);
        movieplateBlur.addChildDisappearAnimator(hover_movieplate, R.id.view_more, Techniques.FlipOutX);
        hover_movieplate.findViewById(R.id.github).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getActivity(), MoviePlate.class);
                startActivity(i);
            }
        });
        hover_movieplate.findViewById(R.id.view_more).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(MOVIEPLATE_GITHUB_URL));
                startActivity(i);
            }
        });

        BlurLayout othelloBlur = (BlurLayout) view.findViewById(R.id.view_hover_othello);
        View hover_othello = LayoutInflater.from(getContext()).inflate(R.layout.hover, null);
        othelloBlur.setHoverView(hover_othello);
        othelloBlur.addChildAppearAnimator(hover_othello, R.id.heart, Techniques.FlipInX);
        othelloBlur.addChildDisappearAnimator(hover_othello, R.id.heart, Techniques.FlipOutX);
        othelloBlur.addChildAppearAnimator(hover_othello, R.id.share, Techniques.FlipInX);
        othelloBlur.addChildDisappearAnimator(hover_othello, R.id.share, Techniques.FlipOutX);
        othelloBlur.addChildAppearAnimator(hover_othello, R.id.github, Techniques.FlipInX);
        othelloBlur.addChildDisappearAnimator(hover_othello, R.id.github, Techniques.FlipOutX);
        othelloBlur.addChildAppearAnimator(hover_othello, R.id.view_more, Techniques.FlipInX);
        othelloBlur.addChildDisappearAnimator(hover_othello, R.id.view_more, Techniques.FlipOutX);
        hover_othello.findViewById(R.id.view_more).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getActivity(), OthelloBoardGame.class);
                startActivity(i);
            }
        });
        hover_othello.findViewById(R.id.github).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(OTHELLO_GITHUB_URL));
                startActivity(i);
            }
        });

        BlurLayout eventleyBlur = (BlurLayout) view.findViewById(R.id.view_hover_eventley);
        View hover_eventley = LayoutInflater.from(getContext()).inflate(R.layout.hover, null);
        eventleyBlur.setHoverView(hover_eventley);
        eventleyBlur.addChildAppearAnimator(hover_eventley, R.id.heart, Techniques.FlipInX);
        eventleyBlur.addChildDisappearAnimator(hover_eventley, R.id.heart, Techniques.FlipOutX);
        eventleyBlur.addChildAppearAnimator(hover_eventley, R.id.share, Techniques.FlipInX);
        eventleyBlur.addChildDisappearAnimator(hover_eventley, R.id.share, Techniques.FlipOutX);
        eventleyBlur.addChildAppearAnimator(hover_eventley, R.id.github, Techniques.FlipInX);
        eventleyBlur.addChildDisappearAnimator(hover_eventley, R.id.github, Techniques.FlipOutX);
        eventleyBlur.addChildAppearAnimator(hover_eventley, R.id.view_more, Techniques.FlipInX);
        eventleyBlur.addChildDisappearAnimator(hover_eventley, R.id.view_more, Techniques.FlipOutX);
        hover_eventley.findViewById(R.id.view_more).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getActivity(), Eventley.class);
                startActivity(i);
            }
        });
        hover_eventley.findViewById(R.id.github).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(EVENTLEY_GITHUB_URL));
                startActivity(i);
            }
        });

        BlurLayout scienificCalculatorBlur = (BlurLayout) view.findViewById(R.id.view_hover_scientific_calculator);
        View hover_scientific_calculator = LayoutInflater.from(getContext()).inflate(R.layout.hover, null);
        scienificCalculatorBlur.setHoverView(hover_scientific_calculator);
        scienificCalculatorBlur.addChildAppearAnimator(hover_scientific_calculator, R.id.heart, Techniques.FlipInX);
        scienificCalculatorBlur.addChildDisappearAnimator(hover_scientific_calculator, R.id.heart, Techniques.FlipOutX);
        scienificCalculatorBlur.addChildAppearAnimator(hover_scientific_calculator, R.id.share, Techniques.FlipInX);
        scienificCalculatorBlur.addChildDisappearAnimator(hover_scientific_calculator, R.id.share, Techniques.FlipOutX);
        scienificCalculatorBlur.addChildAppearAnimator(hover_scientific_calculator, R.id.github, Techniques.FlipInX);
        scienificCalculatorBlur.addChildDisappearAnimator(hover_scientific_calculator, R.id.github, Techniques.FlipOutX);
        scienificCalculatorBlur.addChildAppearAnimator(hover_scientific_calculator, R.id.view_more, Techniques.FlipInX);
        scienificCalculatorBlur.addChildDisappearAnimator(hover_scientific_calculator, R.id.view_more, Techniques.FlipOutX);
        hover_scientific_calculator.findViewById(R.id.view_more).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(getActivity(), ScientficCalculator.class);
                startActivity(i);
            }
        });
        hover_scientific_calculator.findViewById(R.id.github).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(SCIENTIFIC_CALCULATOR_GITHUB_URL));
                startActivity(i);
            }
        });

        return view;
    }
}
