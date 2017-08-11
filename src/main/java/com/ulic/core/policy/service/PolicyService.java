package com.ulic.core.policy.service;

import com.ulic.core.policy.bean.Policy;
import com.ulic.core.policy.dao.PolicyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liutao on 2017/8/11.
 */
@Service
public class PolicyService {
    @Autowired
    private PolicyMapper policyMapper;

    public Policy selectWithId(String id) {
        return policyMapper.selectByPrimaryKey(id);
    }
}
