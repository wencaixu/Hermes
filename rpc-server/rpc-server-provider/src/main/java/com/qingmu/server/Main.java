package com.qingmu.server;

import com.qingmu.server.interfaces.RpcInterface;
import com.qingmu.server.rpc.service.RpcInterfaceService;

public class Main {

    public static void main(String[] args) {
        RpcInterface rpcInterface = new RpcInterfaceService();

        RpcProxyServer server = new RpcProxyServer();
        server.setPort(8080);

        server.publisher(rpcInterface);
    }
}
