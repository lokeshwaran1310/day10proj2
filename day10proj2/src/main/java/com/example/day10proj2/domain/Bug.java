package com.example.day10proj2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="10bugs")
public class Bug {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bugid;
    private String title;
    private String description;
    private String status;
    private String priority;
    @ManyToOne
    @JoinColumn(name="project_ID")
    private Project project;

    public long getBugid() {
        return bugid;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setBugid(long bugid) {
        this.bugid = bugid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }

    

    
}

