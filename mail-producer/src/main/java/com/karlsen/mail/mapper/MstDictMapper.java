package com.karlsen.mail.mapper;

import com.karlsen.mail.entity.MstDict;

public interface MstDictMapper {
    int deleteByPrimaryKey(String id);

    int insert(MstDict record);

    int insertSelective(MstDict record);

    MstDict selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MstDict record);

    int updateByPrimaryKey(MstDict record);
}