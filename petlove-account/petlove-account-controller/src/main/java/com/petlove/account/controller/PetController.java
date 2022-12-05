package com.petlove.account.controller;

import com.petlove.account.dto.PPetDTO;
import com.petlove.account.dto.PPetSaveDTO;
import com.petlove.account.entity.PPetDO;
import com.petlove.account.entity.PUserDO;
import com.petlove.account.service.PetService;
import com.petlove.account.service.PetUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.tangyh.basic.base.R;
import top.tangyh.basic.base.controller.SuperController;
import top.tangyh.basic.utils.ArgumentAssert;

/**
 * Description:
 * Author:vily
 * Date: 2022/11/1
 */

@Slf4j
@Validated
@RestController
@RequestMapping("/pet")
@Api(value = "Pet", tags = "宠物")
@RequiredArgsConstructor
public class PetController extends SuperController<PetService,Long, PPetDO, PPetDTO, PPetSaveDTO, PPetDTO> {


    private final PetUserService petUserService;

    @ApiOperation(value = "测试", notes = "测试")
    @GetMapping("/test")
    public R<String> test(@RequestParam String data) {

        return success(baseService.test(data));
    }

    @Override
    public R<PPetDO> handlerSave(PPetSaveDTO model) {
        PUserDO customDO = petUserService.getById(model.getCustomId());
        ArgumentAssert.notNull(customDO,"当前宠物的主人不存在1");
        return super.handlerSave(model);
    }
}
