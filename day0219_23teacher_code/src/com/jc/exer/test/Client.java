package com.jc.exer.test;

import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);

        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        byte[] data = new byte[10];
        data[1] = 'A';
        data[2] = 'B';
        data[3] = '2';
        data[4] = '2';
        oos.write(data);

        oos.close();
        outputStream.close();
        socket.close();
    }
}
