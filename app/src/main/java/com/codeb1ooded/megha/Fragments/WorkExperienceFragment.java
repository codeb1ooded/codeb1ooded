package com.codeb1ooded.megha.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeb1ooded.megha.Adapters.WorkExperienceAdapter;
import com.codeb1ooded.megha.Constants.Constants;
import com.codeb1ooded.megha.Project.Projects;
import com.codeb1ooded.megha.Constants.URLs;
import com.codeb1ooded.megha.Models.WorkExperience;
import com.codeb1ooded.megha.R;

/**
 * Created by megha on 06/02/17.
 */

public class WorkExperienceFragment extends Fragment implements Constants, Projects, URLs {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_work_experience, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.work_experience_recycler_view);

        WorkExperienceAdapter adapter = new WorkExperienceAdapter(getActivity(),
                WorkExperience.createWorkExperiences(), WorkExperience.createViewType(),
                WorkExperience.createIndexDefined(), WorkExperience.createWorkExperienceIndexDefined());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
