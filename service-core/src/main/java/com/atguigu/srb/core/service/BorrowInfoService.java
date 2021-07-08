package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.BorrowInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
 * <p>
 * 借款信息表 服务类
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface BorrowInfoService extends IService<BorrowInfo> {

    /**
     * 获取借款额度
     *
     * @param userId /
     * @return /
     */
    BigDecimal getBorrowAmount(Long userId);

    /**
     * 提交借款申请
     *
     * @param borrowInfo /
     * @param userId     /
     */
    void saveBorrowInfo(BorrowInfo borrowInfo, Long userId);

    /**
     * 提交借款申请
     *
     * @param userId /
     * @return /
     */
    Integer getStatusByUserId(Long userId);
}
