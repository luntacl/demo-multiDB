package com.ulic.core.policy.service;

import com.ulic.common.datasource.DataSource;
import com.ulic.core.policy.bean.ExtendInfo;
import com.ulic.core.policy.dao.ExtendInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liutao on 2017/8/11.
 */
@Service
public class ExtendInfoService {

    @Autowired
    private ExtendInfoMapper extendInfoMapper;

    @DataSource(name = "ds1")
    public ExtendInfo selectByPrimaryKey(String id) {
        return extendInfoMapper.selectByPrimaryKey(id);
    }
}
