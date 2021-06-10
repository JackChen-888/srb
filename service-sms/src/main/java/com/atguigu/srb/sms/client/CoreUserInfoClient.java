package com.atguigu.srb.sms.client;

import com.atguigu.srb.sms.client.fallback.CoreUserInfoClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: chen
 * @date: 2021年05月28日 15:53
 */
@FeignClient(value = "service-core", fallback = CoreUserInfoClientFallback.class)
public interface CoreUserInfoClient {

    @GetMapping("/api/core/userInfo/checkMobile/{mobile}")
    /**
     *
     * 校验手机号是否注册
     * @param mobile /
     * @return /
     */
    boolean checkMobile(@PathVariable String mobile);
}
