package com.ls.entity;

import org.springframework.stereotype.Repository;

@Repository
public class ExperienceDetailInfo {
    private Integer experienceId;

    private Integer orderId;

    private String experienceSubtitle;

    private String experienceSubcontent;

    private String experienceSubimg;

    public Integer getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(Integer experienceId) {
        this.experienceId = experienceId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getExperienceSubtitle() {
        return experienceSubtitle;
    }

    public void setExperienceSubtitle(String experienceSubtitle) {
        this.experienceSubtitle = experienceSubtitle == null ? null : experienceSubtitle.trim();
    }

    public String getExperienceSubcontent() {
        return experienceSubcontent;
    }

    public void setExperienceSubcontent(String experienceSubcontent) {
        this.experienceSubcontent = experienceSubcontent == null ? null : experienceSubcontent.trim();
    }

    public String getExperienceSubimg() {
        return experienceSubimg;
    }

    public void setExperienceSubimg(String experienceSubimg) {
        this.experienceSubimg = experienceSubimg == null ? null : experienceSubimg.trim();
    }
}