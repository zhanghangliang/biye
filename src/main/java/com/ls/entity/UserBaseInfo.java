package com.ls.entity;

import java.util.Date;

public class UserBaseInfo {
    private Integer userId;

    private String account;

    private String passwd;

    private Date liftBanTime;

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
}