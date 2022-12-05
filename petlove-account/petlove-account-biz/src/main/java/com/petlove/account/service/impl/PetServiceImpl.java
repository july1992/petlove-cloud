package com.petlove.account.service.impl;

import com.petlove.account.dao.PPetMapper;
import com.petlove.account.entity.PPetDO;
import com.petlove.account.service.PetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.tangyh.basic.base.service.SuperServiceImpl;

import java.util.List;


/**
 * Description:
 * Author:vily
 * Date: 2022/11/1
 */

@Slf4j
@Service
public class PetServiceImpl extends SuperServiceImpl<PPetMapper, PPetDO> implements PetService {

    @Override
    public String test(String data) {
        return data;
    }

}
