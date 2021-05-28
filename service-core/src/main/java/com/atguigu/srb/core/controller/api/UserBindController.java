package com.atguigu.srb.core.controller.api;

import com.atguigu.srb.core.service.UserBindService;

import javax.annotation.Resource;

/**
 * @author: chen
 * @date: 2021年05月28日 17:24
 */
//@Api(tags = "会员账号绑定")
//@RestController
//@RequestMapping("/api/core/userBind")
//@Slf4j
public class UserBindController {

    @Resource
    private UserBindService userBindService;

//    @ApiOperation("账户绑定提交数据")
//    @PostMapping("/auth/bind")
//    public R bind(@RequestBody UserBindVO userBindVO, HttpServletRequest request) {
//        String token = request.getHeader("token");
//        Long userId = JwtUtils.getUserId(token);
//        String formStr = userBindService.commitBindUser(userBindVO, userId);
//        return R.ok().data("formStr", formStr);
//    }
}
