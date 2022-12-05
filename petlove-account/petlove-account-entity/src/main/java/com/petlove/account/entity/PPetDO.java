package com.petlove.account.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.experimental.Accessors;
import top.tangyh.basic.base.entity.Entity;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("p_pet")
@ApiModel(value = "PPetDO", description = "宠物")
public class PPetDO extends Entity<Long> {

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
    private Integer age;
	
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

	
}

