package com.ls.entity;

import org.springframework.stereotype.Repository;

@Repository
public class PostBarrage {
    private Integer postId;

    private Integer userId;

    private String barrage;

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

    public String getBarrage() {
        return barrage;
    }

    public void setBarrage(String barrage) {
        this.barrage = barrage == null ? null : barrage.trim();
    }
}