package com.codeb1ooded.megha.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeb1ooded.megha.R;

import github.chenupt.springindicator.SpringIndicator;

/**
 * Created by megha on 10/08/18.
 */

public class SpeakingOpportunitiesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_speaking_opportunities, container, false);
        return view;
    }

}
