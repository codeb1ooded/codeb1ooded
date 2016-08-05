package com.igdtuw.megha.megha.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.igdtuw.megha.megha.Models.CourseRecyclerViewHolder;
import com.igdtuw.megha.megha.R;

/**
 * Created by megha on 5/8/16.
 */
public class CourseRecyclerAdapter extends  RecyclerView.Adapter<CourseRecyclerViewHolder> {

        String name[];
        String subText[];
        Context context;
        LayoutInflater inflater;

        public CourseRecyclerAdapter(Context context, String name[], String subText[]) {
            this.name = name;
            this.subText = subText;
            this.context=context;
            inflater=LayoutInflater.from(context);
        }
        @Override
        public CourseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v=inflater.inflate(R.layout.utility_item_list, parent, false);

            CourseRecyclerViewHolder viewHolder=new CourseRecyclerViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(CourseRecyclerViewHolder holder, final int position) {

            holder.tv1.setText(name[position]);
            holder.tv2.setText(subText[position]);

            holder.tv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "subText is:"+subText[position], Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return name.length;
        }

}
