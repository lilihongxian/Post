package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {
    private String menuId;

    private String menuTitle;

    private String menuHref;

    private String menuIconcls;

    private String menuParentid;

    private List<Menu> children;

    private static final long serialVersionUID = 1L;

    public Menu(String menuId, String menuTitle, String menuHref, String menuIconcls, String menuParentid, List<Menu> children) {
        this.menuId = menuId;
        this.menuTitle = menuTitle;
        this.menuHref = menuHref;
        this.menuIconcls = menuIconcls;
        this.menuParentid = menuParentid;
        this.children = children;
    }

    public Menu() {
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getMenuHref() {
        return menuHref;
    }

    public void setMenuHref(String menuHref) {
        this.menuHref = menuHref;
    }

    public String getMenuIconcls() {
        return menuIconcls;
    }

    public void setMenuIconcls(String menuIconcls) {
        this.menuIconcls = menuIconcls;
    }

    public String getMenuParentid() {
        return menuParentid;
    }

    public void setMenuParentid(String menuParentid) {
        this.menuParentid = menuParentid;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId='" + menuId + '\'' +
                ", menuTitle='" + menuTitle + '\'' +
                ", menuHref='" + menuHref + '\'' +
                ", menuIconcls='" + menuIconcls + '\'' +
                ", menuParentid='" + menuParentid + '\'' +
                ", children=" + children +
                '}';
    }

}