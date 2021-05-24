package com.atguigu.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Description: TODO
 * @author: chen
 * @date: 2021年05月21日 18:08
 */
@Getter
@AllArgsConstructor
@ToString
public enum ResponseEnum {

    SUCCESS(0, "成功"),
    ERROR(- 1, "服务器内部错误"),
    ;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;
}