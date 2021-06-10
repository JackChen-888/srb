package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.BorrowerAttach;
import com.atguigu.srb.core.pojo.vo.BorrowerAttachVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 借款人上传资源表 服务类
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface BorrowerAttachService extends IService<BorrowerAttach> {

    /**
     * 获取附件VO列表
     *
     * @param id /
     * @return /
     */
    List<BorrowerAttachVO> selectBorrowerAttachVOList(Long id);
}
