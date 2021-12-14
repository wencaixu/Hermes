/*
package com.qingmu.server.utils;

import com.qingmu.server.handler.RpcInvocationHandler;
import com.qingmu.server.exception.RpcInvocationException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class RpcClientProxyUtils {

    private RpcClientProxyUtils() {
    }

    public static Object newProxyInstance(Class<?> clazz) {
        return Proxy.newProxyInstance(
                // 代理类加载器
                clazz.getClassLoader(),
                // 被代理类实现接口
                new Class[]{clazz},
                // 执行操作
                new RpcInvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        try {
                            return method.invoke(proxy, args);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            throw new RpcInvocationException("RPC代理类初始化失败，详细信息[{" + e.getMessage() + "}]");
                        }
                    }
                }
        );
    }
}
*/
