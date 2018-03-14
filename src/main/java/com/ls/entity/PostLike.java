package com.ls.entity;

import org.springframework.stereotype.Repository;

@Repository
public class PostLike {
    private Integer postId;

    private Integer like;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }
}