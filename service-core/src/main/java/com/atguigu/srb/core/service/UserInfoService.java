package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.UserInfo;
import com.atguigu.srb.core.pojo.query.UserInfoQuery;
import com.atguigu.srb.core.pojo.vo.LoginVO;
import com.atguigu.srb.core.pojo.vo.RegisterVO;
import com.atguigu.srb.core.pojo.vo.UserInfoVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户基本信息 服务类
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface UserInfoService extends IService<UserInfo> {

    /**
     * 用户注册
     *
     * @param registerVO /
     */
    void register(RegisterVO registerVO);

    /**
     * 会员登陆
     *
     * @param loginVO /
     * @param ip      /
     * @return /
     */
    UserInfoVO login(LoginVO loginVO, String ip);

    /**
     * 获取会员分页列表
     *
     * @param pageParam     /
     * @param userInfoQuery /
     * @return /
     */
    IPage<UserInfo> listPage(Page<UserInfo> pageParam, UserInfoQuery userInfoQuery);

    /**
     * 锁定和解锁
     *
     * @param id     /
     * @param status /
     */
    void lock(Long id, Integer status);

    /**
     * 校验手机号是否注册
     *
     * @param mobile /
     * @return /
     */
    boolean checkMobile(String mobile);
}
