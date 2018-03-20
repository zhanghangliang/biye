package com.ls.entity;

import org.springframework.stereotype.Repository;

@Repository
public class ExperienceBarrage {
    private Integer experienceId;

    private Integer userId;

    private String expBarrage;

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

    public String getExpBarrage() {
        return expBarrage;
    }

    public void setExpBarrage(String expBarrage) {
        this.expBarrage = expBarrage == null ? null : expBarrage.trim();
    }
}