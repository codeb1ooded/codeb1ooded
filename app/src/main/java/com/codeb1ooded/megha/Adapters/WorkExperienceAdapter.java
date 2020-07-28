package com.codeb1ooded.megha.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.codeb1ooded.megha.Models.WorkExperience;
import com.codeb1ooded.megha.Models.WorkProject;
import com.codeb1ooded.megha.R;

import java.util.ArrayList;

/**
 * Created by megha on 06/02/17.
 */

public class WorkExperienceAdapter  extends RecyclerView.Adapter<WorkExperienceAdapter.ViewHolder>{

    final private int WORK_EXPERIENCE_VIEW_HOLDER = 0;
    final private int WORK_PROJECT_VIEW_HOLDER = 1;

    ArrayList<WorkExperience> workExperiences;
    Context context;
    LayoutInflater inflater;
    ArrayList<Integer> viewType, indexArray, workExperienceIndexArray;

    public WorkExperienceAdapter(Context context, ArrayList<WorkExperience> workExperiences,
                                 ArrayList<Integer> viewType, ArrayList<Integer> indexArray,
                                 ArrayList<Integer> workExperienceIndexArray) {
        this.context = context;
        this.workExperiences = workExperiences;
        this.viewType = viewType;
        this.indexArray = indexArray;
        this.workExperienceIndexArray = workExperienceIndexArray;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        ViewHolder viewHolder;
        switch (viewType) {
            case WORK_EXPERIENCE_VIEW_HOLDER:
                v = inflater.inflate(R.layout.utility_item_list_work, parent, false);
                viewHolder = new ViewHolder(v, viewType);
                return  viewHolder;
            case WORK_PROJECT_VIEW_HOLDER:
                v = inflater.inflate(R.layout.utility_item_work_project, parent, false);
                viewHolder = new ViewHolder(v, viewType);
                return  viewHolder;
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        int index = indexArray.get(position);
        switch (holder.getItemViewType()) {
            case WORK_EXPERIENCE_VIEW_HOLDER:
                holder.tv_title.setText(workExperiences.get(index).getTitle());
                holder.tv_detail.setText(workExperiences.get(index).getDescription());
                break;

            case WORK_PROJECT_VIEW_HOLDER:
                final WorkProject workProject = workExperiences.get(workExperienceIndexArray.get(position)).
                        getWorkProjects().get(index);
                holder.titleView.setText(workProject.getTitle());
                holder.roleView.setText(workProject.getRole());
                holder.descriptionView.setText(workProject.getDescription());
                holder.urlButton.setText(workProject.getUrlType());
                holder.urlButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent (Intent.ACTION_VIEW);
                        i.setData(Uri.parse(workProject.getUrl()));
                        context.startActivity(i);
                    }
                });
                break;
        }
    }

    @Override
    public int getItemCount() {
        return viewType.size();
    }

    @Override
    public int getItemViewType(int position) {
        return viewType.get(position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        final private int WORK_EXPERIENCE_VIEW_HOLDER = 0;
        final private int WORK_PROJECT_VIEW_HOLDER = 1;

        public TextView tv_title, tv_detail, tv_role;

        TextView titleView;
        TextView roleView;
        TextView descriptionView;
        Button urlButton;

        //This constructor would switch what to findViewBy according to the type of viewType
        public ViewHolder(View itemView, int viewType) {
            super(itemView);
            if (viewType == WORK_EXPERIENCE_VIEW_HOLDER) {
                tv_title = (TextView) itemView.findViewById(R.id.work_title);
                tv_detail = (TextView) itemView.findViewById(R.id.work_detail);
            }
            else if (viewType == WORK_PROJECT_VIEW_HOLDER) {
                titleView = (TextView) itemView.findViewById(R.id.work_project_title);
                roleView = (TextView) itemView.findViewById(R.id.work_project_role);
                descriptionView = (TextView) itemView.findViewById(R.id.work_project_description);
                urlButton = (Button) itemView.findViewById(R.id.work_project_url);
            }
        }
    }

}

