package com.qingmu.server.rpc.service;

import com.qingmu.server.interfaces.RpcInterface;

/**
 * Rpc测试服务
 *
 * @author wencai.xu
 */
public class RpcInterfaceService implements RpcInterface {
    @Override
    public String sayRpc(String txt) {
        return txt+"rpc";
    }
}
