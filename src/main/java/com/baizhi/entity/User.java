package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String userId;

    private String userPhoto;

    private String userDharmaname;

    private String userName;

    private String userSex;

    private String userPrivoince;

    private String userCity;

    private String userSign;

    private String userPhonenum;

    private String userPasswrod;

    private String userSalt;
    @JSONField(format = "yyyy-MM-dd")
    private Date userCteatetime;

    private String userStatus;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    public String getUserDharmaname() {
        return userDharmaname;
    }

    public void setUserDharmaname(String userDharmaname) {
        this.userDharmaname = userDharmaname == null ? null : userDharmaname.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserPrivoince() {
        return userPrivoince;
    }

    public void setUserPrivoince(String userPrivoince) {
        this.userPrivoince = userPrivoince == null ? null : userPrivoince.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign == null ? null : userSign.trim();
    }

    public String getUserPhonenum() {
        return userPhonenum;
    }

    public void setUserPhonenum(String userPhonenum) {
        this.userPhonenum = userPhonenum == null ? null : userPhonenum.trim();
    }

    public String getUserPasswrod() {
        return userPasswrod;
    }

    public void setUserPasswrod(String userPasswrod) {
        this.userPasswrod = userPasswrod == null ? null : userPasswrod.trim();
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }

    public Date getUserCteatetime() {
        return userCteatetime;
    }

    public void setUserCteatetime(Date userCteatetime) {
        this.userCteatetime = userCteatetime;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserPhoto() == null ? other.getUserPhoto() == null : this.getUserPhoto().equals(other.getUserPhoto()))
            && (this.getUserDharmaname() == null ? other.getUserDharmaname() == null : this.getUserDharmaname().equals(other.getUserDharmaname()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserPrivoince() == null ? other.getUserPrivoince() == null : this.getUserPrivoince().equals(other.getUserPrivoince()))
            && (this.getUserCity() == null ? other.getUserCity() == null : this.getUserCity().equals(other.getUserCity()))
            && (this.getUserSign() == null ? other.getUserSign() == null : this.getUserSign().equals(other.getUserSign()))
            && (this.getUserPhonenum() == null ? other.getUserPhonenum() == null : this.getUserPhonenum().equals(other.getUserPhonenum()))
            && (this.getUserPasswrod() == null ? other.getUserPasswrod() == null : this.getUserPasswrod().equals(other.getUserPasswrod()))
            && (this.getUserSalt() == null ? other.getUserSalt() == null : this.getUserSalt().equals(other.getUserSalt()))
            && (this.getUserCteatetime() == null ? other.getUserCteatetime() == null : this.getUserCteatetime().equals(other.getUserCteatetime()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserPhoto() == null) ? 0 : getUserPhoto().hashCode());
        result = prime * result + ((getUserDharmaname() == null) ? 0 : getUserDharmaname().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserPrivoince() == null) ? 0 : getUserPrivoince().hashCode());
        result = prime * result + ((getUserCity() == null) ? 0 : getUserCity().hashCode());
        result = prime * result + ((getUserSign() == null) ? 0 : getUserSign().hashCode());
        result = prime * result + ((getUserPhonenum() == null) ? 0 : getUserPhonenum().hashCode());
        result = prime * result + ((getUserPasswrod() == null) ? 0 : getUserPasswrod().hashCode());
        result = prime * result + ((getUserSalt() == null) ? 0 : getUserSalt().hashCode());
        result = prime * result + ((getUserCteatetime() == null) ? 0 : getUserCteatetime().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userPhoto=").append(userPhoto);
        sb.append(", userDharmaname=").append(userDharmaname);
        sb.append(", userName=").append(userName);
        sb.append(", userSex=").append(userSex);
        sb.append(", userPrivoince=").append(userPrivoince);
        sb.append(", userCity=").append(userCity);
        sb.append(", userSign=").append(userSign);
        sb.append(", userPhonenum=").append(userPhonenum);
        sb.append(", userPasswrod=").append(userPasswrod);
        sb.append(", userSalt=").append(userSalt);
        sb.append(", userCteatetime=").append(userCteatetime);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}