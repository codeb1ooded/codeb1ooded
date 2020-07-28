package com.codeb1ooded.megha.Activities.Miscellaneous;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.codeb1ooded.megha.Constants.Constants;
import com.codeb1ooded.megha.R;

/**
 * Created by megha on 5/8/16.
 */
public class EducationActivity extends AppCompatActivity implements Constants {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miscellaneous_education);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mis_education_recycler_view);

        EducationRecyclerAdapter adapter = new EducationRecyclerAdapter(EducationActivity.this,
                EDUCATION_SCHOOL_NAME, EDUCATION_COURSE_NAME, EDUCATION_PERCENTAGE);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public static class EducationRecyclerAdapter extends  RecyclerView.Adapter<MiscellaneousEducationRecyclerViewHolder> {

        String name[], percentage[], subText[];
        Context context;
        LayoutInflater inflater;

        public EducationRecyclerAdapter(Context context, String name[], String subText[], String percentage[]) {
            this.name = name;
            this.subText = subText;
            this.context = context;
            this.percentage = percentage;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public MiscellaneousEducationRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = inflater.inflate(R.layout.utility_item_list_education, parent, false);
            MiscellaneousEducationRecyclerViewHolder viewHolder = new MiscellaneousEducationRecyclerViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(MiscellaneousEducationRecyclerViewHolder holder, final int position) {

            holder.tv1.setText(name[position]);
            holder.tv2.setText(subText[position]);
            holder.tv3.setText(percentage[position]);

            holder.tv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, subText[position], Toast.LENGTH_SHORT).show();
                }
            });
            holder.tv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, subText[position], Toast.LENGTH_SHORT).show();
                }
            });
            holder.tv3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, subText[position], Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return name.length;
        }

    }

    public static class MiscellaneousEducationRecyclerViewHolder extends RecyclerView.ViewHolder {

        public TextView tv1, tv2, tv3;

        public MiscellaneousEducationRecyclerViewHolder(View itemView) {
            super(itemView);
            tv1 = (TextView) itemView.findViewById(R.id.list_education_title);
            tv2 = (TextView) itemView.findViewById(R.id.list_degree_n_year);
            tv3 = (TextView) itemView.findViewById(R.id.list_cgpa);
        }

    }

}
