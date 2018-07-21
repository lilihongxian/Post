package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Banner implements Serializable {
    private String bannerId;

    private String bannerPicname;

    private String bannerPicpath;

    private String bannerDescription;

    private String bannerStatus;
    @JSONField(format = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date bannerCreattime;

    private static final long serialVersionUID = 1L;

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId == null ? null : bannerId.trim();
    }

    public String getBannerPicname() {
        return bannerPicname;
    }

    public void setBannerPicname(String bannerPicname) {
        this.bannerPicname = bannerPicname == null ? null : bannerPicname.trim();
    }

    public String getBannerPicpath() {
        return bannerPicpath;
    }

    public void setBannerPicpath(String bannerPicpath) {
        this.bannerPicpath = bannerPicpath == null ? null : bannerPicpath.trim();
    }

    public String getBannerDescription() {
        return bannerDescription;
    }

    public void setBannerDescription(String bannerDescription) {
        this.bannerDescription = bannerDescription == null ? null : bannerDescription.trim();
    }

    public String getBannerStatus() {
        return bannerStatus;
    }

    public void setBannerStatus(String bannerStatus) {
        this.bannerStatus = bannerStatus == null ? null : bannerStatus.trim();
    }

    public Date getBannerCreattime() {
        return bannerCreattime;
    }

    public void setBannerCreattime(Date bannerCreattime) {
        this.bannerCreattime = bannerCreattime;
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
        Banner other = (Banner) that;
        return (this.getBannerId() == null ? other.getBannerId() == null : this.getBannerId().equals(other.getBannerId()))
            && (this.getBannerPicname() == null ? other.getBannerPicname() == null : this.getBannerPicname().equals(other.getBannerPicname()))
            && (this.getBannerPicpath() == null ? other.getBannerPicpath() == null : this.getBannerPicpath().equals(other.getBannerPicpath()))
            && (this.getBannerDescription() == null ? other.getBannerDescription() == null : this.getBannerDescription().equals(other.getBannerDescription()))
            && (this.getBannerStatus() == null ? other.getBannerStatus() == null : this.getBannerStatus().equals(other.getBannerStatus()))
            && (this.getBannerCreattime() == null ? other.getBannerCreattime() == null : this.getBannerCreattime().equals(other.getBannerCreattime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBannerId() == null) ? 0 : getBannerId().hashCode());
        result = prime * result + ((getBannerPicname() == null) ? 0 : getBannerPicname().hashCode());
        result = prime * result + ((getBannerPicpath() == null) ? 0 : getBannerPicpath().hashCode());
        result = prime * result + ((getBannerDescription() == null) ? 0 : getBannerDescription().hashCode());
        result = prime * result + ((getBannerStatus() == null) ? 0 : getBannerStatus().hashCode());
        result = prime * result + ((getBannerCreattime() == null) ? 0 : getBannerCreattime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bannerId=").append(bannerId);
        sb.append(", bannerPicname=").append(bannerPicname);
        sb.append(", bannerPicpath=").append(bannerPicpath);
        sb.append(", bannerDescription=").append(bannerDescription);
        sb.append(", bannerStatus=").append(bannerStatus);
        sb.append(", bannerCreattime=").append(bannerCreattime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}