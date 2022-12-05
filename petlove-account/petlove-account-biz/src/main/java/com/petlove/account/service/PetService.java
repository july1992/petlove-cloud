package com.petlove.account.service;

import com.petlove.account.entity.PPetDO;
import top.tangyh.basic.base.service.SuperService;

/**
 * Description:
 * Author:vily
 * Date: 2022/11/1
 */

public interface PetService extends SuperService<PPetDO> {

    String test(String data);
}
