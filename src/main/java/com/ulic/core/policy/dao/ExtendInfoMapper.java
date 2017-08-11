package com.ulic.core.policy.dao;

import com.ulic.core.policy.bean.ExtendInfo;

public interface ExtendInfoMapper {
    int deleteByPrimaryKey(String productMetadataId);

    int insert(ExtendInfo record);

    int insertSelective(ExtendInfo record);

    ExtendInfo selectByPrimaryKey(String productMetadataId);

    int updateByPrimaryKeySelective(ExtendInfo record);

    int updateByPrimaryKey(ExtendInfo record);
}