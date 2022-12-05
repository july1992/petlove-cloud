package com.petlove.account.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.experimental.Accessors;
import top.tangyh.basic.base.entity.SuperEntity;
import top.tangyh.lamp.model.enumeration.Sex;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
//@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("p_user")
@ApiModel(value = "PUserDO", description = "顾客")
public class PUserDO implements Serializable {

	private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "主键")
    @NotNull(message = "id不能为空", groups = SuperEntity.Update.class)
    protected Long id;


	/**
     * 账号
     */
    @ApiModelProperty(value = "账号")
    @Size(max = 20, message = "账号长度不能超过30")
    @Excel(name = "账号", width = 20)
    private String account;
	
	/**
     * 手机
     */
    @ApiModelProperty(value = "手机")
    @Size(max = 20, message = "手机号长度不能超过20")
    @Excel(name = "手机", width = 20)
    private String mobile;
	
	/**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    @Size(max = 255, message = "头像长度不能超过255")
    @Excel(name = "头像")
    private String avatar;
	
	/**
     * 名字
     */
    @ApiModelProperty(value = "名字")
    @Size(max = 50, message = "手机号长度不能超过50")
    @Excel(name = "名字", width = 50)
    private String name;

    /**
     * 性别
     * #Sex{W:女;M:男;N:未知}
     */
    @ApiModelProperty(value = "性别")
    @Excel(name = "性别", replace = {"女_W", "男_M", "未知_N", "_null"})
    private Sex sex;

	/**
     * 当前状态，1:可用，0:不可用
     */
    @ApiModelProperty(value = "当前状态，1:可用，0:不可用")
    @Excel(name = "状态", replace = {"启用_true", "禁用_false", "_null"})
    private Boolean state;
	
	/**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    @NotEmpty(message = "密码不能为空")
    @Size(max = 64, message = "密码长度不能超过64")
    private String password;
	
	/**
     * 密码盐
     */
    @ApiModelProperty(value = "密码盐")
    @NotEmpty(message = "密码盐不能为空")
    @Size(max = 20, message = "密码盐长度不能超过20")
    private String salt;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    protected LocalDateTime createTime;

    @ApiModelProperty(value = "最后修改时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    protected LocalDateTime updateTime;

}

