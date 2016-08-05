package com.igdtuw.megha.megha.Activities.Project.Miscellaneous;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.igdtuw.megha.megha.Adapters.EducationRecyclerAdapter;
import com.igdtuw.megha.megha.R;

/**
 * Created by megha on 5/8/16.
 */
public class EducationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miscellaneous_education);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mis_education_recycler_view);
        String name[] = {"IGDTUW", "Vivekanand School", "NJAP School"};
        String subText[] = {"B.Tech (CSE)", "12th", "10th"};
        String percentage[] = {"86.23%", "94.6%", "10 CGPA"};

        EducationRecyclerAdapter adapter = new EducationRecyclerAdapter(EducationActivity.this, name, subText, percentage);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
