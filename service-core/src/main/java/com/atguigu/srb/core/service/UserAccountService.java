package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.UserAccount;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.Map;

/**
 * <p>
 * 用户账户 服务类
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface UserAccountService extends IService<UserAccount> {

    /**
     * 充值
     *
     * @param chargeAmt /
     * @param userId    /
     * @return /
     */
    String commitCharge(BigDecimal chargeAmt, Long userId);

    /**
     * 交易
     *
     * @param paramMap /
     * @return /
     */
    String notify(Map<String, Object> paramMap);

    /**
     * 查询账户余额
     *
     * @param userId /
     * @return /
     */
    BigDecimal getAccount(Long userId);
}
