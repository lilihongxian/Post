package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private String albumId;

    private String albumTitle;

    private Double albumScore;

    private String albumBrodecast;

    private String albumAuthor;

    private String albumDescription;

    private Date albumPublishtime;

    private Integer albumCount;

    private String albumCoverimg;

    private String albumStatus;

    private static final long serialVersionUID = 1L;

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId == null ? null : albumId.trim();
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle == null ? null : albumTitle.trim();
    }

    public Double getAlbumScore() {
        return albumScore;
    }

    public void setAlbumScore(Double albumScore) {
        this.albumScore = albumScore;
    }

    public String getAlbumBrodecast() {
        return albumBrodecast;
    }

    public void setAlbumBrodecast(String albumBrodecast) {
        this.albumBrodecast = albumBrodecast == null ? null : albumBrodecast.trim();
    }

    public String getAlbumAuthor() {
        return albumAuthor;
    }

    public void setAlbumAuthor(String albumAuthor) {
        this.albumAuthor = albumAuthor == null ? null : albumAuthor.trim();
    }

    public String getAlbumDescription() {
        return albumDescription;
    }

    public void setAlbumDescription(String albumDescription) {
        this.albumDescription = albumDescription == null ? null : albumDescription.trim();
    }

    public Date getAlbumPublishtime() {
        return albumPublishtime;
    }

    public void setAlbumPublishtime(Date albumPublishtime) {
        this.albumPublishtime = albumPublishtime;
    }

    public Integer getAlbumCount() {
        return albumCount;
    }

    public void setAlbumCount(Integer albumCount) {
        this.albumCount = albumCount;
    }

    public String getAlbumCoverimg() {
        return albumCoverimg;
    }

    public void setAlbumCoverimg(String albumCoverimg) {
        this.albumCoverimg = albumCoverimg == null ? null : albumCoverimg.trim();
    }

    public String getAlbumStatus() {
        return albumStatus;
    }

    public void setAlbumStatus(String albumStatus) {
        this.albumStatus = albumStatus == null ? null : albumStatus.trim();
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
        Album other = (Album) that;
        return (this.getAlbumId() == null ? other.getAlbumId() == null : this.getAlbumId().equals(other.getAlbumId()))
            && (this.getAlbumTitle() == null ? other.getAlbumTitle() == null : this.getAlbumTitle().equals(other.getAlbumTitle()))
            && (this.getAlbumScore() == null ? other.getAlbumScore() == null : this.getAlbumScore().equals(other.getAlbumScore()))
            && (this.getAlbumBrodecast() == null ? other.getAlbumBrodecast() == null : this.getAlbumBrodecast().equals(other.getAlbumBrodecast()))
            && (this.getAlbumAuthor() == null ? other.getAlbumAuthor() == null : this.getAlbumAuthor().equals(other.getAlbumAuthor()))
            && (this.getAlbumDescription() == null ? other.getAlbumDescription() == null : this.getAlbumDescription().equals(other.getAlbumDescription()))
            && (this.getAlbumPublishtime() == null ? other.getAlbumPublishtime() == null : this.getAlbumPublishtime().equals(other.getAlbumPublishtime()))
            && (this.getAlbumCount() == null ? other.getAlbumCount() == null : this.getAlbumCount().equals(other.getAlbumCount()))
            && (this.getAlbumCoverimg() == null ? other.getAlbumCoverimg() == null : this.getAlbumCoverimg().equals(other.getAlbumCoverimg()))
            && (this.getAlbumStatus() == null ? other.getAlbumStatus() == null : this.getAlbumStatus().equals(other.getAlbumStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAlbumId() == null) ? 0 : getAlbumId().hashCode());
        result = prime * result + ((getAlbumTitle() == null) ? 0 : getAlbumTitle().hashCode());
        result = prime * result + ((getAlbumScore() == null) ? 0 : getAlbumScore().hashCode());
        result = prime * result + ((getAlbumBrodecast() == null) ? 0 : getAlbumBrodecast().hashCode());
        result = prime * result + ((getAlbumAuthor() == null) ? 0 : getAlbumAuthor().hashCode());
        result = prime * result + ((getAlbumDescription() == null) ? 0 : getAlbumDescription().hashCode());
        result = prime * result + ((getAlbumPublishtime() == null) ? 0 : getAlbumPublishtime().hashCode());
        result = prime * result + ((getAlbumCount() == null) ? 0 : getAlbumCount().hashCode());
        result = prime * result + ((getAlbumCoverimg() == null) ? 0 : getAlbumCoverimg().hashCode());
        result = prime * result + ((getAlbumStatus() == null) ? 0 : getAlbumStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", albumId=").append(albumId);
        sb.append(", albumTitle=").append(albumTitle);
        sb.append(", albumScore=").append(albumScore);
        sb.append(", albumBrodecast=").append(albumBrodecast);
        sb.append(", albumAuthor=").append(albumAuthor);
        sb.append(", albumDescription=").append(albumDescription);
        sb.append(", albumPublishtime=").append(albumPublishtime);
        sb.append(", albumCount=").append(albumCount);
        sb.append(", albumCoverimg=").append(albumCoverimg);
        sb.append(", albumStatus=").append(albumStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}