package com.ls.entity;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class UserBaseInfo {
    private Integer userId;

    private String account;

    private String passwd;

    private Date liftBanTime;

    private Integer type;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public Date getLiftBanTime() {
        return liftBanTime;
    }

    public void setLiftBanTime(Date liftBanTime) {
        this.liftBanTime = liftBanTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}