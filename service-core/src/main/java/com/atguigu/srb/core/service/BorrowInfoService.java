package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.BorrowInfo;
import com.atguigu.srb.core.pojo.vo.BorrowInfoApprovalVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

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


    /**
     * 借款信息列表
     *
     * @return /
     */
    List<BorrowInfo> selectList();

    /**
     * 获取借款信息
     *
     * @param id /
     * @return /
     */
    Map<String, Object> getBorrowInfoDetail(Long id);

    /**
     * 审批借款信息
     *
     * @param borrowInfoApprovalVO /
     */
    void approval(BorrowInfoApprovalVO borrowInfoApprovalVO);
}
