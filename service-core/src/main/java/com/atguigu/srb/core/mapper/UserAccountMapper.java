package com.atguigu.srb.core.mapper;

import com.atguigu.srb.core.pojo.entity.UserAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import feign.Param;

import java.math.BigDecimal;

/**
 * <p>
 * 用户账户 Mapper 接口
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface UserAccountMapper extends BaseMapper<UserAccount> {

    /**
     * 优化
     *
     * @param bindCode     /
     * @param amount       /
     * @param freezeAmount /
     */
    void updateAccount(
            @Param("bindCode") String bindCode,
            @Param("amount") BigDecimal amount,
            @Param("freezeAmount") BigDecimal freezeAmount);
}
