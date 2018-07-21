package com.baizhi.service.impl;

import com.baizhi.aop.LogAnnotation;
import com.baizhi.dao.ManagerMapper;
import com.baizhi.entity.Manager;
import com.baizhi.service.ManagerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by admin on 2018/7/5.
 */
@Service
@Transactional
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager queryOne(String id) {
        return managerMapper.selectByPrimaryKey(id);
    }

    @Override
    @LogAnnotation(name="查询登陆")
    public Manager queryOneByUsername(String magUsername) {
        return managerMapper.selectOneByUsername(magUsername);
    }
}
