package com.jc.tcp.demo1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 需求：
 * （1）与服务器建立连接，或者说和服务器发起连接请求
 * （2）直接接收服务器发过来的东西
 * （3）断开
 */
public class Client1 {
    public static void main(String[] args) throws Exception {
        //两个参数分别表示：服务器端的IP地址，和端口号
        //因为现在是自己的电脑上的两个程序连接，所以用本地的IP地址
        //如果不是本地两个程序的话，就要用IP对方的IP地址

        Socket socket = new Socket(InetAddress.getLocalHost(),8888);

        InputStream in = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("333.pdf");
        byte[] data = new byte[1024];
        int len;
        while((len = in.read(data)) != -1){
            fos.write(data);
        }

        //如果后面不和这个服务器通信了，就要关闭socket
        socket.close();
    }
}
