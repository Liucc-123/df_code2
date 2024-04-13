package com.xdap.selfdevelopeddemo.controller;

import com.xdap.api.moudle.user.vo.LoginUserVo;
import com.xdap.runtime.service.RuntimeAppContextService;
import com.xdap.runtime.service.RuntimeDatasourceService;
import com.xdap.runtime.service.RuntimeTokenService;
import com.xdap.runtime.service.RuntimeUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description: 基础接口说明
 * @author: zhangHao
 * @since: 2022/1/7 15:55
 * @history: 1.2022/1/7 created by zhangHao
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/custom/basics")
@Slf4j
public class FruitBasicsController {

    private final RuntimeTokenService runtimeTokenService;

    private final RuntimeUserService runtimeUserService;

    private final RuntimeAppContextService runtimeAppContextService;

    private final RuntimeDatasourceService runtimeDatasourceService;

    /**
     * 通过用户id获取token
     *
     * @param userId
     * @return
     */
    @GetMapping("/token")
    public String createCustomToken(@RequestParam("userId") String userId) {
        return runtimeTokenService.createToken(userId, 60000);
    }

    @GetMapping("/hello")
    public String hello() {
        String tenantId = runtimeAppContextService.getCurrentTenantId();
        String appId = runtimeAppContextService.getCurrentAppId();
        String userId = runtimeAppContextService.getCurrentUserId();
        LoginUserVo loginUserVo = runtimeUserService.queryLoginUserVo(userId, tenantId, appId);
        log.info("loginUserVo:{}", loginUserVo);
        return "hello";
    }

    /**
     * 通过id获取用户信息
     *
     * @param userId
     * @return
     */
    @GetMapping("/userInfo")
    public LoginUserVo customLoginUserVo(@RequestParam("userId") String userId) {
        return runtimeUserService.queryLoginUserVo(userId, runtimeAppContextService.getCurrentTenantId(), runtimeAppContextService.getCurrentAppId());
    }

    /**
     * 通过账号获取用户信息
     *
     * @param account
     * @return
     */
    @GetMapping("/userInfoByAccount")
    public LoginUserVo customLoginUserVoByAccount(@RequestParam("account") String account) {
        return runtimeUserService.queryLoginUserVoByAccount(account, runtimeAppContextService.getCurrentTenantId(), runtimeAppContextService.getCurrentAppId());
    }

}
