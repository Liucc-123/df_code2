package com.xdap.selfdevelopeddemo.config;

import com.xdap.api.moudle.custom.AllowUrlManage;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description: 接口白名单配置
 * @author: zhangHao
 * @since: 2022/1/6 12:07
 * @history: 1.2022/1/6 created by zhangHao
 */
@Component
public class FruitAllowUrlConfig implements AllowUrlManage {
    @Override
    public Set<String> getCustomAllowUrls() {
        Set<String> urlSet = new HashSet<>();
        urlSet.add("/custom/*");
        return urlSet;
    }
}
