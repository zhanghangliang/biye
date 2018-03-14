package com.ls.entity;

import org.springframework.stereotype.Repository;

@Repository
public class UserFocus {
    private Integer userId;

    private Integer focusUserId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFocusUserId() {
        return focusUserId;
    }

    public void setFocusUserId(Integer focusUserId) {
        this.focusUserId = focusUserId;
    }
}