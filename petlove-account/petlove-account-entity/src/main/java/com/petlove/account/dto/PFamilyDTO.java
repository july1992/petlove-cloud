package com.petlove.account.dto;

import lombok.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Builder
@ApiModel(value = "CFamilyDTO", description = "")
public class PFamilyDTO implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
     * 
     */
	@ApiModelProperty(value = "")
    private Long id;
	
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

