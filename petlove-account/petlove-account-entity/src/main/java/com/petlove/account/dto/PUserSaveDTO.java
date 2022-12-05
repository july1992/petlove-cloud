package com.petlove.account.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import top.tangyh.lamp.model.enumeration.Sex;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Builder
@ApiModel(value = "CCustomDTO", description = "用户")
public class PUserSaveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
     * 账号
     */
	@ApiModelProperty(value = "账号")
    private String account;
	
	/**
     * 手机
     */
	@ApiModelProperty(value = "手机")
    private String mobile;
	
	/**
     * 头像
     */
	@ApiModelProperty(value = "头像")
    private String avatar;
	
	/**
     * 名字
     */
	@ApiModelProperty(value = "名字")
    private String name;

	/**
	 * 性别
	 * #Sex{W:女;M:男;N:未知}
	 */
	@ApiModelProperty(value = "性别")
	private Sex sex;
	
	/**
     * 当前状态，1:可用，0:不可用
     */
	@ApiModelProperty(value = "当前状态，1:可用，0:不可用")
    private Boolean state;

}

