package com.igdtuw.megha.megha.Activities.Project.Miscellaneous;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.igdtuw.megha.megha.R;

/**
 * Created by megha on 5/8/16.
 */
public class PositionsofResponsibilityActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miscellaneous_positions_of_responsibility);
/*

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mis_por_recycler_view);
        String name[] = {"IGDTUW", "Vivekanand School", "NJAP School"};
        String subText[] = {"B.Tech (CSE)", "12th", "10th"};

        PositionofResponsibilityRecyclerAdapter adapter = new PositionofResponsibilityRecyclerAdapter(PositionsofResponsibilityActivity.this, name, subText);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
*/
    }
}