package com.baizhi.service;

import com.baizhi.entity.Banner;
import com.baizhi.entity.BannerDto;

import java.util.List;


/**
 * Created by admin on 2018/7/8.
 */
public interface BannerService<T> {
    List<Banner> queryAll();

    BannerDto querySplit(int page, int rows);

    void regist(T banner);

    void change(T banner);

    void drop(String id);
}
