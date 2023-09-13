package com.jc.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
（1）启动一个Socket，用于发送数据报
（2）准备发送的数据
（3）把数据包装到数据报对象中
（4）通过socket把数据报发出去
 */
public class Send {
    public static void main(String[] args) throws Exception {
        //没有指定IP和端口号，ip地址默认本机，端口随机分配，现在不关心发送方的IP和端口号
        DatagramSocket ds = new DatagramSocket();

        String str = "欢迎来到尚硅谷";
        /*
        public DatagramPacket(byte[] buf,int length,InetAddress address,int port)
        构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。length 参数必须小于等于 buf.length。
         */

        byte[] data = str.getBytes();
        DatagramPacket dp = new DatagramPacket(data,data.length, InetAddress.getLocalHost(),8888);

        ds.send(dp);
        System.out.println("发送完毕");

        ds.close();
    }
}
