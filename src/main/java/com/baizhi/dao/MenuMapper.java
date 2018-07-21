package com.baizhi.dao;

import com.baizhi.entity.Menu;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(String menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(String menuId);

    List<Menu> selectAll();

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}