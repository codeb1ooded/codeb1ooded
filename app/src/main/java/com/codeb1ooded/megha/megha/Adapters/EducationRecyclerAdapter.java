package com.codeb1ooded.megha.megha.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.codeb1ooded.megha.megha.Models.MiscellaneousEducationRecyclerViewHolder;
import com.codeb1ooded.megha.megha.R;

/**
 * Created by megha on 5/8/16.
 */
public class EducationRecyclerAdapter extends  RecyclerView.Adapter<MiscellaneousEducationRecyclerViewHolder> {

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
        View v=inflater.inflate(R.layout.utility_item_list_education, parent, false);

        MiscellaneousEducationRecyclerViewHolder viewHolder=new MiscellaneousEducationRecyclerViewHolder(v);
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

