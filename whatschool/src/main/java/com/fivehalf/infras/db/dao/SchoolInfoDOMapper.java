package com.fivehalf.infras.db.dao;

import com.fivehalf.infras.db.entity.SchoolInfoDO;

public interface SchoolInfoDOMapper {
    int deleteByPrimaryKey(String name);

    int insert(SchoolInfoDO record);

    int insertSelective(SchoolInfoDO record);

    SchoolInfoDO selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(SchoolInfoDO record);

    int updateByPrimaryKey(SchoolInfoDO record);
}