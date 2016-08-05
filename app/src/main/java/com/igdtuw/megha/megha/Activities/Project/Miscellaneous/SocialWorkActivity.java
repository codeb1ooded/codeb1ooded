package com.igdtuw.megha.megha.Activities.Project.Miscellaneous;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.igdtuw.megha.megha.R;

/**
 * Created by megha on 5/8/16.
 */
public class SocialWorkActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miscellaneous_socialwork);
/*
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mis_sw_recycler_view);
        String name[] = {"Care Promise Welfare Society",
                "Leaders For Tomorrow"};
        String subText[] = {"Certificate of Special Effort and Silver Medal for participating\n as volunteer in Mass Awareness Campaign against Cancer/ Hepatitis-B",
                "Volunteered for LFT's Annual Fest-DWD'15 and other awareness programmes organized"};
        SocialWorkRecyclerAdapter adapter = new SocialWorkRecyclerAdapter(SocialWorkActivity.this, name, subText);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));*/
    }
}
