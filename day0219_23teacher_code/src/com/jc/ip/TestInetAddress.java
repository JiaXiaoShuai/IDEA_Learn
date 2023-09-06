package com.jc.ip;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * java.lang
 * java.math
 * java.io
 * java.time
 * java.text
 * java.io
 * java.util
 * java.net
 */
public class TestInetAddress {
    @Test
    public void test01() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();//获取本地主机名和地址
        System.out.println(localHost);
    }

    @Test
    public void test02() throws UnknownHostException {
        InetAddress localHost = InetAddress.getByName("www.baidu.com");
        System.out.println(localHost);
    }

    @Test
    public void test03() throws UnknownHostException {
        byte[] arr = {(byte) 110, (byte) 242, 68, 4};
        InetAddress localHost = InetAddress.getByAddress(arr);
        System.out.println(localHost);
    }
}
