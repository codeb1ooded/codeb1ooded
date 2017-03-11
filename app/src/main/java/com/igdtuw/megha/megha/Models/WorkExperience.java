package com.igdtuw.megha.megha.Models;

import com.igdtuw.megha.megha.Constants.Constants;
import com.igdtuw.megha.megha.Constants.Projects;
import com.igdtuw.megha.megha.Constants.URLs;

import java.util.ArrayList;

/**
 * Created by megha on 11/03/17.
 */

public class WorkExperience implements Constants, Projects, URLs {

    private String title;
    private String description;
    private String role;
    private ArrayList<WorkProject> workProjects;
    private int num_of_projects;

    final private static int WORK_EXPERIENCE_VIEW_HOLDER = 0;
    final private static int WORK_PROJECT_VIEW_HOLDER = 1;

    public WorkExperience(String title, String description, String role, ArrayList<WorkProject> workProjects){
        this.title = title;
        this.description = description;
        this.role = role;
        this.workProjects = workProjects;
        this.num_of_projects = workProjects.size();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRole() {
        return role;
    }

    public ArrayList<WorkProject> getWorkProjects() {
        return workProjects;
    }

    public int getNum_of_projects() {
        return num_of_projects;
    }

    public static ArrayList<WorkExperience> createWorkExperiences(){

        ArrayList<WorkExperience> workExperiences = new ArrayList<>();
        ArrayList<WorkProject> workProject;

        // Work project for creapptic technology
        workProject = new ArrayList<>();
        workProject.add(new WorkProject(CREAPPTIC_TRADING_ADDA_TITLE, CREAPPTIC_TRADING_ADDA_DESCRIPTION,
                "App Developer", TRADING_ADDA_PS_URL, "Play Store"));
        workProject.add(new WorkProject(CREAPPTIC_MYSORE_WEST_TITLE, CREAPPTIC_MYSORE_WEST_DESCRIPTION,
                "App Developer", MYSORE_WEST_PS_URL, "Play Store"));
        workExperiences.add(new WorkExperience(WORK_TITLE_CREAPPTIC, WORK_DESCRIPTION_CREAPPTIC,
                WORK_ROLE_CREAPPTIC, workProject));

        return workExperiences;
    }

    public static ArrayList<Integer> createViewType(){
        ArrayList<Integer> viewType = new ArrayList<>();

        viewType.add(WORK_EXPERIENCE_VIEW_HOLDER);
        viewType.add(WORK_PROJECT_VIEW_HOLDER);
        viewType.add(WORK_PROJECT_VIEW_HOLDER);

        return viewType;
    }

    public static ArrayList<Integer> createIndexDefined(){
        ArrayList<Integer> index = new ArrayList<>();

        index.add(0);   // creapptic
        index.add(0);   // creapptic project 1
        index.add(1);   // creapptic project 2

        return index;
    }
}
