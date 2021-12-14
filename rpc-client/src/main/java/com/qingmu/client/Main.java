package com.qingmu.client;

import com.qingmu.client.utils.RpcClientProxyUtils;
import com.qingmu.server.interfaces.RpcInterface;

public class Main {

    public static void main(String[] args) {
        RpcInterface rpcInterface = (RpcInterface) RpcClientProxyUtils.newProxyInstance(RpcInterface.class,"localhost",8080);
        String s = rpcInterface.sayRpc("wencai.xu");
        System.out.println(s);
    }
}
