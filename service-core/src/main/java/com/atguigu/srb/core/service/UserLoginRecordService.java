package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.UserLoginRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户登录记录表 服务类
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface UserLoginRecordService extends IService<UserLoginRecord> {

    /**
     * 获取会员登录日志列表
     *
     * @param userId /
     * @return /
     */
    List<UserLoginRecord> listTop50(Long userId);
}
