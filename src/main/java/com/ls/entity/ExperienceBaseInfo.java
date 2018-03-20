package com.ls.entity;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class ExperienceBaseInfo {
    private Integer experienceId;

    private Integer userId;

    private String experienceTitle;

    private Date experienceTime;

    private Integer status;

    private String experienceContent;

    public Integer getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(Integer experienceId) {
        this.experienceId = experienceId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getExperienceTitle() {
        return experienceTitle;
    }

    public void setExperienceTitle(String experienceTitle) {
        this.experienceTitle = experienceTitle == null ? null : experienceTitle.trim();
    }

    public Date getExperienceTime() {
        return experienceTime;
    }

    public void setExperienceTime(Date experienceTime) {
        this.experienceTime = experienceTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getExperienceContent() {
        return experienceContent;
    }

    public void setExperienceContent(String experienceContent) {
        this.experienceContent = experienceContent == null ? null : experienceContent.trim();
    }
}