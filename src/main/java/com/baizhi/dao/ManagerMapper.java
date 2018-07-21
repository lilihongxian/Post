package com.baizhi.dao;

import com.baizhi.entity.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(String magId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(String magId);

    Manager selectOneByUsername(String magUsername);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}