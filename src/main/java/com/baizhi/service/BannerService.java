package com.baizhi.service;

import com.baizhi.entity.Banner;
import com.baizhi.entity.BannerDto;

import java.util.List;


/**
 * Created by admin on 2018/7/8.
 */
public interface BannerService {
    List<Banner> queryAll();

    BannerDto querySplit(int page, int rows);

    void regist(Banner banner);

    void change(Banner banner);

    void drop(String id);
}
