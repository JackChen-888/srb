package com.atguigu.srb.core.mapper;

import com.atguigu.srb.core.pojo.entity.BorrowInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 借款信息表 Mapper 接口
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface BorrowInfoMapper extends BaseMapper<BorrowInfo> {

    /**
     * 借款信息列表
     *
     * @return /
     */
    List<BorrowInfo> selectBorrowInfoList();
}
