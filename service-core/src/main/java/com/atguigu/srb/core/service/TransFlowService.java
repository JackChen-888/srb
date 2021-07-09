package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.bo.TransFlowBO;
import com.atguigu.srb.core.pojo.entity.TransFlow;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 交易流水表 服务类
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface TransFlowService extends IService<TransFlow> {

    /**
     * 保存交易流水业务
     *
     * @param transFlowBO /
     */
    void saveTransFlow(TransFlowBO transFlowBO);

    /**
     * 判断流水是否存在
     *
     * @param agentBillNo /
     * @return /
     */
    boolean isSaveTransFlow(String agentBillNo);
}
