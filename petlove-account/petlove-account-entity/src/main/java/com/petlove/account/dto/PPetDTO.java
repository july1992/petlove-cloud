package com.petlove.account.dto;

import lombok.Data;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "CPetDTO", description = "")
public class PPetDTO implements Serializable {

    private static final long serialVersionUID = 1L;
	
	/**
     * 
     */
	@ApiModelProperty(value = "")
    private Long id;
	
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
    private String description;
	
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

	/**
	 * 创建人
	 */
	@ApiModelProperty(value = "创建人")
	private Long updatedBy;
	
}

