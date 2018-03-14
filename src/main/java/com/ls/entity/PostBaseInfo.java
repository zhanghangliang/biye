package com.ls.entity;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class PostBaseInfo {
    private Integer postId;

    private Integer userId;

    private String postImg;

    private String postTitle;

    private Date postTime;

    private String postIntro;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPostImg() {
        return postImg;
    }

    public void setPostImg(String postImg) {
        this.postImg = postImg == null ? null : postImg.trim();
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getPostIntro() {
        return postIntro;
    }

    public void setPostIntro(String postIntro) {
        this.postIntro = postIntro == null ? null : postIntro.trim();
    }
}