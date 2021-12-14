package com.qingmu.client.handler;

import com.qingmu.client.net.transport.RpcNetTransport;
import com.qingmu.server.handler.RpcInvocationHandler;
import com.qingmu.server.request.RpcRequest;

import java.lang.reflect.Method;

/**
 * 远程RPC调用
 *
 * @author wencai.xu
 */
public class RemoteRpcInvocationHandler implements RpcInvocationHandler {

    private String host;

    private int port;

    public RemoteRpcInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RpcRequest request = new RpcRequest();

        request.setClassName(method.getDeclaringClass().getName());
        request.setMethodName(method.getName());
        request.setParams(args);
        request.setTypes(method.getParameterTypes());

        // 数据发送
        RpcNetTransport rpcNetTransport = new RpcNetTransport(host,port);
        Object send = rpcNetTransport.send(request);
        return send;
    }
}
