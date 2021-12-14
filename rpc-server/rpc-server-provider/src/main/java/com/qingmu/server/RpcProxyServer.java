package com.qingmu.server;


import com.qingmu.server.request.RpcRequest;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wencai.xu
 */
public class RpcProxyServer {

    private int port = 8080;

    public void setPort(int port) {
        this.port = port;
    }

    public void publisher(Object service){
        try {
            ServerSocket socket = new ServerSocket(port);
            while(true){
                Socket accept = socket.accept();
                ObjectOutputStream os = new ObjectOutputStream(accept.getOutputStream()); // 获取响应给客户端的数据
                ObjectInputStream  is = new ObjectInputStream(accept.getInputStream()); // 获得客户端数据

                RpcRequest rpcRequest = (RpcRequest) is.readObject();
                // 反射调用
                Class className = Class.forName(rpcRequest.getClassName());
                Method method = className.getMethod(rpcRequest.getMethodName(),rpcRequest.getTypes());
                Object result = method.invoke(service, rpcRequest.getParams());

                os.writeObject(result);
                os.flush();
            }
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
