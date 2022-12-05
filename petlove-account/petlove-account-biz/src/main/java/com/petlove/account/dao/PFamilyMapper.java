package com.petlove.account.dao;

import com.petlove.account.entity.PFamilyDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.tangyh.basic.base.mapper.SuperMapper;

@Mapper
@Repository
public interface PFamilyMapper extends SuperMapper<PFamilyDO> {


}

