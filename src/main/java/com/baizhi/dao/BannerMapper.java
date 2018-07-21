package com.baizhi.dao;

import com.baizhi.entity.Banner;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface BannerMapper {
    int deleteByPrimaryKey(String bannerId);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(String bannerId);

    List<Banner> selectAll();

    List<Banner> splitpage(@Param("page") int page, @Param("rows") int rows);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);

    void update(Banner banner);
}