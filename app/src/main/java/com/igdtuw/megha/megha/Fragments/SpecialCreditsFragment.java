package com.igdtuw.megha.megha.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.igdtuw.megha.megha.R;

/**
 * Created by megha on 10/7/16.
 */
public class SpecialCreditsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_credits_fragment, container, false);

        return view;
    }
}
