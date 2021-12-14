package com.qingmu.client.utils;

import com.qingmu.client.handler.RemoteRpcInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * RPC工具类
 *
 * @author wencai.xu
 */
public final class RpcClientProxyUtils {

    private RpcClientProxyUtils() {
    }

    public static Object newProxyInstance(Class<?> clazz,String host,int port) {
        return Proxy.newProxyInstance(
                // 代理类加载器
                clazz.getClassLoader(),
                // 被代理类实现接口
                new Class[]{clazz},
                // 执行操作
                new RemoteRpcInvocationHandler(host,port)
        );
    }
}
