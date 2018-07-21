package com.baizhi.entity;

import java.io.Serializable;

public class Manager implements Serializable {
    private String magId;

    private String magRealname;

    private String magUsername;

    private String magPassword;

    private Integer magLevel;

    private static final long serialVersionUID = 1L;

    public String getMagId() {
        return magId;
    }

    public void setMagId(String magId) {
        this.magId = magId == null ? null : magId.trim();
    }

    public String getMagRealname() {
        return magRealname;
    }

    public void setMagRealname(String magRealname) {
        this.magRealname = magRealname == null ? null : magRealname.trim();
    }

    public String getMagUsername() {
        return magUsername;
    }

    public void setMagUsername(String magUsername) {
        this.magUsername = magUsername == null ? null : magUsername.trim();
    }

    public String getMagPassword() {
        return magPassword;
    }

    public void setMagPassword(String magPassword) {
        this.magPassword = magPassword == null ? null : magPassword.trim();
    }

    public Integer getMagLevel() {
        return magLevel;
    }

    public void setMagLevel(Integer magLevel) {
        this.magLevel = magLevel;
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
        Manager other = (Manager) that;
        return (this.getMagId() == null ? other.getMagId() == null : this.getMagId().equals(other.getMagId()))
            && (this.getMagRealname() == null ? other.getMagRealname() == null : this.getMagRealname().equals(other.getMagRealname()))
            && (this.getMagUsername() == null ? other.getMagUsername() == null : this.getMagUsername().equals(other.getMagUsername()))
            && (this.getMagPassword() == null ? other.getMagPassword() == null : this.getMagPassword().equals(other.getMagPassword()))
            && (this.getMagLevel() == null ? other.getMagLevel() == null : this.getMagLevel().equals(other.getMagLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMagId() == null) ? 0 : getMagId().hashCode());
        result = prime * result + ((getMagRealname() == null) ? 0 : getMagRealname().hashCode());
        result = prime * result + ((getMagUsername() == null) ? 0 : getMagUsername().hashCode());
        result = prime * result + ((getMagPassword() == null) ? 0 : getMagPassword().hashCode());
        result = prime * result + ((getMagLevel() == null) ? 0 : getMagLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", magId=").append(magId);
        sb.append(", magRealname=").append(magRealname);
        sb.append(", magUsername=").append(magUsername);
        sb.append(", magPassword=").append(magPassword);
        sb.append(", magLevel=").append(magLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}