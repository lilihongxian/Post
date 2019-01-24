package com.baizhi.service.impl;

import com.baizhi.dao.BannerMapper;
import com.baizhi.entity.Banner;
import com.baizhi.entity.BannerDto;
import com.baizhi.service.BannerService;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2018/7/8.
 */
@Service
@Transactional
public class BannerServiceImpl implements BannerService<Banner>{

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Banner> queryAll() {
        return bannerMapper.selectAll();
    }

    @Override
    public BannerDto querySplit(int page, int rows) {
        BannerDto bannerDto = new BannerDto();
        int p = (page-1)*rows;
        int r = page*rows;
        bannerDto.setRows(bannerMapper.splitpage(p,r));
        bannerDto.setTotal(bannerMapper.selectAll().size());
        return bannerDto;
    }

    @Override
    public void regist(Banner banner) {
        String replace = UUID.randomUUID().toString().replace("-", "");
        banner.setBannerId(replace);
        bannerMapper.insert(banner);
    }

    @Override
    public void change(Banner banner) {
        bannerMapper.updateByPrimaryKey(banner);
    }

    @Override
    public void drop(String id) {
        bannerMapper.deleteByPrimaryKey(id);
    }
}
