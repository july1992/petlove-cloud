package com.petlove.account.service.impl;

import com.petlove.account.dao.PFamilyMapper;
import com.petlove.account.entity.PFamilyDO;
import com.petlove.account.service.FamilyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.tangyh.basic.base.service.SuperServiceImpl;


/**
 * Description:
 * Author:vily
 * Date: 2022/11/1
 */

@Slf4j
@Service
public class FamilyServiceImpl extends SuperServiceImpl<PFamilyMapper, PFamilyDO> implements FamilyService {

    @Override
    public String test(String data) {
        return data;
    }
}
