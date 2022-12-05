package com.petlove.account.controller;

import com.petlove.account.dto.PFamilyDTO;
import com.petlove.account.dto.PFamilySaveDTO;
import com.petlove.account.entity.PFamilyDO;
import com.petlove.account.entity.PUserDO;
import com.petlove.account.service.FamilyService;
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
@RequestMapping("/family")
@Api(value = "Family", tags = "家庭")
@RequiredArgsConstructor
public class FamilyController extends SuperController<FamilyService,Long, PFamilyDO, PFamilyDTO, PFamilySaveDTO, PFamilyDTO> {


    private final PetUserService petUserService;

    @Override
    public R<PFamilyDO> handlerSave(PFamilySaveDTO model) {

        PUserDO customDO = petUserService.getById(model.getFMaster());
        ArgumentAssert.notNull(customDO,"当前大家庭创建人不存在");

        return super.handlerSave(model);
    }

    @ApiOperation(value = "测试", notes = "测试")
    @GetMapping("/test")
    public R<String> test(@RequestParam String data) {
        return success(baseService.test(data));
    }
}
