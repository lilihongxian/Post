package com.baizhi.service;

import com.baizhi.aop.LogAnnotation;
import com.baizhi.entity.Manager;

/**
 * Created by admin on 2018/7/5.
 */
public interface ManagerService {
    Manager queryOne(String id);


    Manager queryOneByUsername(String magUsername);
}
