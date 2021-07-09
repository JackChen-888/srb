package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.UserBind;
import com.atguigu.srb.core.pojo.vo.UserBindVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

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
     *
     * @param userBindVO /
     * @param userId     /
     * @return /
     */
    String commitBindUser(UserBindVO userBindVO, Long userId);

    /**
     * 修改绑定状态
     *
     * @param paramMap /
     */
    void notify(Map<String, Object> paramMap);

    /**
     * 获取投资人的绑定协议号
     *
     * @param investUserId /
     * @return /
     */
    String getBindCodeByUserId(Long investUserId);
}
