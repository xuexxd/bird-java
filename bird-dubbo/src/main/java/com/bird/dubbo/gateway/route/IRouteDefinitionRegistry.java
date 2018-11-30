package com.bird.dubbo.gateway.route;

import java.util.List;

/**
 * 网关配置注册器
 *
 * @author liuxx
 * @date 2018/11/15
 */
public interface IRouteDefinitionRegistry {

    /**
     * 注册
     * @param routeDefinitions 网关定义
     */
    void register(List<DubboRouteDefinition> routeDefinitions);
}
