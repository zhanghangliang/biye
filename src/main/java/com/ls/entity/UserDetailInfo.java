package com.ls.entity;

import org.springframework.stereotype.Repository;

@Repository
public class UserDetailInfo {
    private Integer userId;

    private String name;

    private String email;

    private String sex;

    private String photo1;

    private String photo2;

    private String photo3;

    private String photo4;

    private String photo5;

    private String photo6;

    private String photo7;

    private String personalProfile;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1 == null ? null : photo1.trim();
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2 == null ? null : photo2.trim();
    }

    public String getPhoto3() {
        return photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3 == null ? null : photo3.trim();
    }

    public String getPhoto4() {
        return photo4;
    }

    public void setPhoto4(String photo4) {
        this.photo4 = photo4 == null ? null : photo4.trim();
    }

    public String getPhoto5() {
        return photo5;
    }

    public void setPhoto5(String photo5) {
        this.photo5 = photo5 == null ? null : photo5.trim();
    }

    public String getPhoto6() {
        return photo6;
    }

    public void setPhoto6(String photo6) {
        this.photo6 = photo6 == null ? null : photo6.trim();
    }

    public String getPhoto7() {
        return photo7;
    }

    public void setPhoto7(String photo7) {
        this.photo7 = photo7 == null ? null : photo7.trim();
    }

    public String getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(String personalProfile) {
        this.personalProfile = personalProfile == null ? null : personalProfile.trim();
    }
}