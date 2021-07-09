package com.atguigu.srb.core.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: chen
 * @date: 2021年07月09日 17:30
 */
@Data
@ApiModel(description = "投标信息")
public class InvestVO {

    private Long lendId;

    @ApiModelProperty(value = "投标金额")
    private String investAmount;

    @ApiModelProperty(value = "用户id")
    private Long investUserId;

    @ApiModelProperty(value = "用户姓名")
    private String investName;
}