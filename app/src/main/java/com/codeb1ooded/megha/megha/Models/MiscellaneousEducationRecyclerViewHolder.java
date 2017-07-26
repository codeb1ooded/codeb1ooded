package com.codeb1ooded.megha.megha.Models;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.codeb1ooded.megha.megha.R;

/**
 * Created by megha on 5/8/16.
 */
public class MiscellaneousEducationRecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView tv1, tv2, tv3;

    public MiscellaneousEducationRecyclerViewHolder(View itemView) {
        super(itemView);

        tv1 = (TextView) itemView.findViewById(R.id.list_education_title);
        tv2 = (TextView) itemView.findViewById(R.id.list_degree_n_year);
        tv3 = (TextView) itemView.findViewById(R.id.list_cgpa);

    }

}
