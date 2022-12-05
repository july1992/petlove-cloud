package com.petlove.account.controller;

import com.petlove.account.dto.PUserDTO;
import com.petlove.account.dto.PUserSaveDTO;
import com.petlove.account.entity.PUserDO;
import com.petlove.account.service.PetUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.tangyh.basic.base.R;
import top.tangyh.basic.base.controller.SuperController;

/**
 * Description:
 * Author:vily
 * Date: 2022/11/1
 */

@Slf4j
@Validated
@RestController
@RequestMapping("/puser")
@Api(value = "PetUser", tags = "顾客")
public class PetUserController extends SuperController<PetUserService,Long, PUserDO, PUserDTO, PUserSaveDTO, PUserDTO> {



    @ApiOperation(value = "测试", notes = "测试")
    @GetMapping("/test")
    public R<String> test(@RequestParam String data) {
        return success(baseService.test(data));
    }
}
