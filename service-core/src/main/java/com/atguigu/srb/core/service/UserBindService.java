package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.UserBind;
import com.atguigu.srb.core.pojo.vo.UserBindVO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户绑定表 服务类
 * </p>
 *
 * @author Chen
 * @since 2021-05-21
 */
public interface UserBindService extends IService<UserBind> {
    /**
     * 账户绑定提交到托管平台的数据
     */
    String commitBindUser(UserBindVO userBindVO, Long userId);
}
