package com.petlove.account.service.impl;

import com.petlove.account.dao.PUserMapper;
import com.petlove.account.entity.PUserDO;
import com.petlove.account.service.PetUserService;
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
public class PetUserServiceImpl extends SuperServiceImpl<PUserMapper, PUserDO> implements PetUserService {

    @Override
    public String test(String data) {
        return data;
    }
}
