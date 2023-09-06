package com.jc.tcp.demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 需求：
 * （1）开启一个TCP协议的服务，在8888端口号监听客户端的连接。
 * （2）接收一个客户端的连接
 * （3）给这个客户端发东西
 * （4）断开
 */
public class Server1 {


    public static void main(String[] args) throws IOException {
        //开启一个TCP协议的服务，在8888端口号监听客户端的连接。
        ServerSocket ss = new ServerSocket(8888);

        //正式接收客户端的连接
        Socket socket = ss.accept();

        System.out.println(socket.getInetAddress().getHostAddress()+"连接成功！");

        /*
        这是一个阻塞式方法，
        如果此时没有客户端来请求，则这句代码一直等待
        这句代码执行一次，就表示有一个客户端请求连接了，并且连接成功，连接成功后，会分配一个socket对象
        这个socket对象用来和客户端进行数据的传输通信
         */

        //给这个客户发一句话：欢迎登录
        OutputStream os = socket.getOutputStream();//获取输出流用于发送消息，输出数据
        FileInputStream fis = new FileInputStream("E:\\learn\\测试\\新建文件夹\\尚硅谷-JavaSE课堂笔记.pdf");
        byte[] bytes = new byte[1024];
        String str;
        int len;
        while ((len = fis.read(bytes))!=-1) {
            os.write(bytes);
        }
        //如果后面不和这个客户端通信了，就要关闭socket
        socket.close();

        //如果后面也不接收其他客户端连接了，那么服务要关闭
        ss.close();
    }
}
