package com.petlove.account.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "CPetDTO", description = "")
public class PPetSaveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

	
	/**
     * 主人id
     */
	@ApiModelProperty(value = "主人id")
    private Long customId;
	
	/**
     * 名称
     */
	@ApiModelProperty(value = "名称")
    private String name;
	
	/**
     * 年龄
     */
	@ApiModelProperty(value = "年龄")
    private String age;
	
	/**
     * 体重
     */
	@ApiModelProperty(value = "体重")
    private String weight;
	
	/**
     * 图文详情
     */
	@ApiModelProperty(value = "图文详情")
    private String desc;
	
	/**
     * 头像
     */
	@ApiModelProperty(value = "头像")
    private String avatar;
	
	/**
     * 生日
     */
	@ApiModelProperty(value = "生日")
    private Date birthday;
	
	/**
     * 创建人
     */
	@ApiModelProperty(value = "创建人")
    private Long createdBy;
	
}

