package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.Borrower;
import com.atguigu.srb.core.pojo.vo.BorrowerDetailVO;
import com.atguigu.srb.core.pojo.vo.BorrowerVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 借款人 服务类
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface BorrowerService extends IService<Borrower> {

    /**
     * 保存借款人信息
     *
     * @param borrowerVO /
     * @param userId     /
     */
    void saveBorrowerVoByUserId(BorrowerVO borrowerVO, Long userId);

    /**
     * 获取借款人认证状态
     *
     * @param userId /
     * @return /
     */
    Integer getStatusByUserId(Long userId);

    /**
     * 获取借款人分页列表
     *
     * @param pageParam /
     * @param keyword   /
     * @return /
     */
    IPage<Borrower> listPage(Page<Borrower> pageParam, String keyword);

    /**
     * 获取借款人信息
     *
     * @param id /
     * @return /
     */
    BorrowerDetailVO getBorrowerDetailVoById(Long id);
}