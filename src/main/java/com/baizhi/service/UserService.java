package com.baizhi.service;

import com.baizhi.entity.MapDto;
import com.baizhi.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/7/10.
 */
public interface UserService {
    List<Integer> queryWeek(int[] day);

    Map<String,List<MapDto>> queryPri();

    List<User> queryAll();
}
