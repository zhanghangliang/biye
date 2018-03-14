package com.ls.entity;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class ExperienceReply {
    private Integer replyId;

    private Integer commentId;

    private Integer userId;

    private Integer beReplyUserId;

    private Date replyTime;

    private String replyContent;

    private Integer replyLike;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBeReplyUserId() {
        return beReplyUserId;
    }

    public void setBeReplyUserId(Integer beReplyUserId) {
        this.beReplyUserId = beReplyUserId;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public Integer getReplyLike() {
        return replyLike;
    }

    public void setReplyLike(Integer replyLike) {
        this.replyLike = replyLike;
    }
}