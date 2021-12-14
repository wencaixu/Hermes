package com.qingmu.client.net.transport;


import com.qingmu.server.request.RpcRequest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 网络传输
 *
 * @author wencai.xu
 */
public class RpcNetTransport {

    private String host;

    private int port;

    public RpcNetTransport(String host, int port) {
        this.host = host;
        this.port = port;
    }

    /**
     * 发送数据
     * @param request {@link RpcRequest}
     * @return
     */
    public Object send(RpcRequest request){
        try (Socket socket = new Socket(host,port);
             ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream())){
            os.writeObject(request);
            os.flush();
            ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
            return is.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
