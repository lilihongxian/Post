package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class Chapter implements Serializable {
    private String chpId;

    private String chpName;

    private String chpUrl;

    private String chpSize;

    private String chpTimes;

    private Date chpCreattime;

    private static final long serialVersionUID = 1L;

    public String getChpId() {
        return chpId;
    }

    public void setChpId(String chpId) {
        this.chpId = chpId == null ? null : chpId.trim();
    }

    public String getChpName() {
        return chpName;
    }

    public void setChpName(String chpName) {
        this.chpName = chpName == null ? null : chpName.trim();
    }

    public String getChpUrl() {
        return chpUrl;
    }

    public void setChpUrl(String chpUrl) {
        this.chpUrl = chpUrl == null ? null : chpUrl.trim();
    }

    public String getChpSize() {
        return chpSize;
    }

    public void setChpSize(String chpSize) {
        this.chpSize = chpSize == null ? null : chpSize.trim();
    }

    public String getChpTimes() {
        return chpTimes;
    }

    public void setChpTimes(String chpTimes) {
        this.chpTimes = chpTimes == null ? null : chpTimes.trim();
    }

    public Date getChpCreattime() {
        return chpCreattime;
    }

    public void setChpCreattime(Date chpCreattime) {
        this.chpCreattime = chpCreattime;
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
        Chapter other = (Chapter) that;
        return (this.getChpId() == null ? other.getChpId() == null : this.getChpId().equals(other.getChpId()))
            && (this.getChpName() == null ? other.getChpName() == null : this.getChpName().equals(other.getChpName()))
            && (this.getChpUrl() == null ? other.getChpUrl() == null : this.getChpUrl().equals(other.getChpUrl()))
            && (this.getChpSize() == null ? other.getChpSize() == null : this.getChpSize().equals(other.getChpSize()))
            && (this.getChpTimes() == null ? other.getChpTimes() == null : this.getChpTimes().equals(other.getChpTimes()))
            && (this.getChpCreattime() == null ? other.getChpCreattime() == null : this.getChpCreattime().equals(other.getChpCreattime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChpId() == null) ? 0 : getChpId().hashCode());
        result = prime * result + ((getChpName() == null) ? 0 : getChpName().hashCode());
        result = prime * result + ((getChpUrl() == null) ? 0 : getChpUrl().hashCode());
        result = prime * result + ((getChpSize() == null) ? 0 : getChpSize().hashCode());
        result = prime * result + ((getChpTimes() == null) ? 0 : getChpTimes().hashCode());
        result = prime * result + ((getChpCreattime() == null) ? 0 : getChpCreattime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chpId=").append(chpId);
        sb.append(", chpName=").append(chpName);
        sb.append(", chpUrl=").append(chpUrl);
        sb.append(", chpSize=").append(chpSize);
        sb.append(", chpTimes=").append(chpTimes);
        sb.append(", chpCreattime=").append(chpCreattime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}