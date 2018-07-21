package com.baizhi.service.impl;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.MapDto;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/7/10.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Integer> queryWeek(int[] day) {
        List<Integer> list = new ArrayList<>();
        for (int i : day) {
            int i1 = userMapper.selectWeek(i);
            list.add(i1);
        }
        return list;
    }

    @Override
    public Map<String,List<MapDto>> queryPri() {
        List<User> users = userMapper.selectAll();
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        Map<String,List<MapDto>> map = new HashMap<>();
        List<MapDto> list = new ArrayList<>();
        List<MapDto> list2 = new ArrayList<>();
        for (User user : users) {
            if (user.getUserSex().equals("男")){
                if (!map1.containsKey(user.getUserPrivoince())){
                    map1.put(user.getUserPrivoince(),1);
                }else{
                    map1.put(user.getUserPrivoince(),map1.get(user.getUserPrivoince())+1);
                }
            }else{
                if (!map2.containsKey(user.getUserPrivoince())){
                    map2.put(user.getUserPrivoince(),1);
                }else{
                    map2.put(user.getUserPrivoince(),map2.get(user.getUserPrivoince())+1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            MapDto dto = new MapDto();
            dto.setName(entry.getKey());
            dto.setValue(entry.getValue());
            list.add(dto);
        }
        map.put("男",list);


        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            MapDto dto = new MapDto();
            dto.setName(entry.getKey());
            dto.setValue(entry.getValue());
            list2.add(dto);
        }
        map.put("女",list2);
        return map;
    }

    @Override
    public List<User> queryAll() {
        return userMapper.selectAll();
    }
}
