package com.petlove.account.service;

import com.petlove.account.entity.PUserDO;
import top.tangyh.basic.base.service.SuperService;
/**
 * Description:
 * Author:vily
 * Date: 2022/11/1
 */

public interface PetUserService extends SuperService<PUserDO> {

    String test(String data);
}
