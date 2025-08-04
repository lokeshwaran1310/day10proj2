package com.example.day10proj2.dto;

public class ProjectBugCountDto {
    
    private String projectName;
    private long bugCount;

    public ProjectBugCountDto(String projectName, long bugCount) {
        this.projectName = projectName;
        this.bugCount = bugCount;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public long getBugCount() {
        return bugCount;
    }

    public void setBugCount(long bugCount) {
        this.bugCount = bugCount;
    }
}
