package com.ulic.core.policy.dao;

import com.ulic.core.policy.bean.Policy;
import com.ulic.core.policy.bean.PolicyWithBLOBs;

public interface PolicyMapper {
    int deleteByPrimaryKey(String policyId);

    int insert(PolicyWithBLOBs record);

    int insertSelective(PolicyWithBLOBs record);

    PolicyWithBLOBs selectByPrimaryKey(String policyId);

    int updateByPrimaryKeySelective(PolicyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PolicyWithBLOBs record);

    int updateByPrimaryKey(Policy record);
}