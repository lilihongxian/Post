package com.baizhi.dao;

import com.baizhi.entity.Chapter;

public interface ChapterMapper {
    int deleteByPrimaryKey(String chpId);

    int insert(Chapter record);

    int insertSelective(Chapter record);

    Chapter selectByPrimaryKey(String chpId);

    int updateByPrimaryKeySelective(Chapter record);

    int updateByPrimaryKey(Chapter record);
}