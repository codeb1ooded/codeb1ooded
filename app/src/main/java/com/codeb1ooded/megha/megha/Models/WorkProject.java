package com.codeb1ooded.megha.megha.Models;

/**
 * Created by megha on 06/02/17.
 */

public class WorkProject {

    private String title;
    private String type;
    private String description;
    private String role;
    private String url;
    private String urlType;     // like link of play store, demo, etc.

    public WorkProject(String title, String type, String description, String role, String url, String urlType) {
        this.title = title;
        this.type = type;
        this.description = description;
        this.role = role;
        this.url = url;
        this.urlType = urlType;
    }
    public WorkProject(String title, String description, String role, String url, String urlType) {
        this.title = title;
        this.description = description;
        this.role = role;
        this.url = url;
        this.urlType = urlType;
    }

    public String getTitle() {
        return title;
    }

    public String getRole() {
        return role;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlType() {
        return urlType;
    }
}
