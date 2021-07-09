package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.BorrowInfo;
import com.atguigu.srb.core.pojo.entity.Lend;
import com.atguigu.srb.core.pojo.vo.BorrowInfoApprovalVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 标的准备表 服务类
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface LendService extends IService<Lend> {

    /**
     * 创建标
     *
     * @param borrowInfoApprovalVO /
     * @param borrowInfo           /
     */
    void createLend(BorrowInfoApprovalVO borrowInfoApprovalVO, BorrowInfo borrowInfo);

    /**
     * 创建标
     *
     * @return /
     */
    List<Lend> selectList();

    /**
     * 获取标的信息
     *
     * @param id /
     * @return /
     */
    Map<String, Object> getLendDetail(Long id);

    /**
     * 计算投资收益
     *
     * @param invest       /
     * @param yearRate     /
     * @param totalMonth   /
     * @param returnMethod /
     * @return /
     */
    BigDecimal getInterestCount(BigDecimal invest, BigDecimal yearRate, Integer totalMonth, Integer returnMethod);
}
