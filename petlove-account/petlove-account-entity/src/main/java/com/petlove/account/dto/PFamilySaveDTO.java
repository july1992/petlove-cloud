package com.petlove.account.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
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
public class PFamilySaveDTO implements Serializable {

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

