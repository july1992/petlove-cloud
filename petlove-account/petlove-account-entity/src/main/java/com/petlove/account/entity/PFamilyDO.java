package com.petlove.account.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.experimental.Accessors;
import top.tangyh.basic.base.entity.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("p_family")
@ApiModel(value = "PFamilyDO", description = "家庭")
public class PFamilyDO extends Entity<Long> {

	private static final long serialVersionUID = 1L;

	
	/**
     * 一家之主
     */
    @ApiModelProperty(value = "一家之主")
    private Long fMaster;
	
	/**
     * 二号成员
     */
    @ApiModelProperty(value = "二号成员")
    private Long fTwo;
	
	/**
     * 三号成员
     */
    @ApiModelProperty(value = "三号成员")
    private Long fThree;
	
	/**
     * 四号成员
     */
    @ApiModelProperty(value = "四号成员")
    private Long fFour;
	
	/**
     * 五号成员
     */
    @ApiModelProperty(value = "五号成员")
    private Long fFive;
	
}

