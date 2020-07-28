package com.codeb1ooded.megha.Project;


/**
 * Created by megha on 29/07/17.
 */

public class ProjectModel implements Projects{

    String projectName;
    int imagesArray[];
    String projectDescription;
    String technologiesUsed;
    String demoLink;
    String githubLink;
    String playstoreLink;
    String developers;
    String mentors;

    public ProjectModel(String projectName, int imagesArray[], String projectDescription, String technologiesUsed,
                        String demoLink, String githubLink, String playstoreLink, String developers, String mentors) {
        this.projectName = projectName;
        this.imagesArray = imagesArray;
        this.projectDescription = projectDescription;
        this.technologiesUsed = technologiesUsed;
        this.demoLink = demoLink;
        this.githubLink = githubLink;
        this.playstoreLink = playstoreLink;
        this.developers = developers;
        this.mentors = mentors;
    }

    public static ProjectModel createRTIDetails(){
        return new ProjectModel(RTI_NAME,
                RTI_IMAGES_ARRAY,
                RTI_DESCRIPTION,
                RTI_TECHNOLOGIES_USED,
                RTI_DEMO_LINK,
                RTI_GITHUB_LINK,
                null,
                RTI_DEVELOPERS,
                RTI_MENTORS);
    }

    public static ProjectModel createMoviePlateDetails(){
        return new ProjectModel(MOVIEPLATE_NAME,
                MOVIEPLATE_IMAGES_ARRAY,
                MOVIEPLATE_DESCRIPTION,
                MOVIEPLATE_TECHNOLOGIES_USED,
                null,
                MOVIEPLATE_GITHUB_LINK,
                MOVIEPLATE_PLAYSTORE_LINK,
                MOVIEPLATE_DEVELOPERS,
                MOVIEPLATE_MENTORS);
    }

    public static ProjectModel createOthelloDetails(){
        return new ProjectModel(OTHELLO_NAME,
                OTHELLO_IMAGES_ARRAY,
                OTHELLO_DESCRIPTION,
                OTHELLO_TECHNOLOGIES_USED,
                null,
                OTHELLO_GITHUB_LINK,
                null,
                OTHELLO_DEVELOPERS,
                OTHELLO_MENTORS);
    }

    public static ProjectModel createEventleyDetails(){
        return new ProjectModel(EVENTLEY_NAME,
                EVENTLEY_IMAGES_ARRAY,
                EVENTLEY_DESCRIPTION,
                EVENTLEY_TECHNOLOGIES_USED,
                EVENTLEY_DEMO_LINK,
                EVENTLEY_GITHUB_LINK,
                null,
                EVENTLEY_DEVELOPERS,
                EVENTLEY_MENTORS);
    }

    public static ProjectModel createCalculatorDetails(){
        return new ProjectModel(CALCULATOR_NAME,
                CALCULATOR_IMAGES_ARRAY,
                CALCULATOR_DESCRIPTION,
                CALCULATOR_TECHNOLOGIES_USED,
                null,
                CALCULATOR_GITHUB_LINK,
                CALCULATOR_PLAYSTORE_LINK,
                CALCULATOR_DEVELOPERS,
                null);
    }

    public String getProjectName() {
        return projectName;
    }

    public int[] getImagesArray() {
        return imagesArray;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public String getTechnologiesUsed() {
        return technologiesUsed;
    }

    public String getDemoLink() {
        return demoLink;
    }

    public String getGithubLink() {
        return githubLink;
    }

    public String getPlaystoreLink() {
        return playstoreLink;
    }

    public String getDevelopers() {
        return developers;
    }

    public String getMentors() {
        return mentors;
    }
}
