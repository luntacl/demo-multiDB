package com.ulic.rest;

import com.ulic.core.policy.bean.ExtendInfo;
import com.ulic.core.policy.bean.Policy;
import com.ulic.core.policy.service.ExtendInfoService;
import com.ulic.core.policy.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liutao on 2017/6/21.
 */
@RestController
@RequestMapping("api/insert")
public class InsertRest {

    @Autowired
    private ExtendInfoService extendInfoService;
    @Autowired
    private PolicyService policyService;

    @RequestMapping("test")
    public String insertTest() {
        Policy policy = policyService.selectWithId("07010401080320170000004");
        return policy.toString();
    }
    @RequestMapping("test-ctrip-db")
    public String ctripTest() {
        ExtendInfo extendInfo = extendInfoService.selectByPrimaryKey("847685440834271015");
        return extendInfo.toString();
    }
}
