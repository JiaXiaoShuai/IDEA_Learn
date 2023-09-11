package com.jc.tcp.demo3;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
需求：
(1)开启一个TCP协议的服务，在8888端口号监听客户端的连接。
(2)接收一个客户端的连接
(3)接收客户端发过来的单词或词语，然后我把它“反转”
例如：客户端发过来“hello"，反转"olleh"
(4)把反转后的单词或词语，返回给客户端
(5)直到客户端发过来"bye"为止

升级需求，同时接收多个客户端连接

 */
public class Server3 {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8888);

        while (true) {
            //正式接受客户端的连接
            Socket socket = server.accept();
            System.out.println(socket.getInetAddress().getHostAddress() + "连接成功！");
            //启动线程
            new ClientHandlerThread(socket).start();
        }

        //       不关闭，因为要接收n个客户端连接，一直工作
        //        server.close();
    }
}

class ClientHandlerThread extends Thread {
    private Socket socket;
    private static int index = 1;

    public ClientHandlerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                InputStream in = socket.getInputStream();
                OutputStream out = socket.getOutputStream();

                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(isr);

                PrintStream ps = new PrintStream(out);) {

            InetAddress inetAddress = socket.getInetAddress();
            String replace = inetAddress.toString().replace("/", "");

            System.out.println("连接的主机名为："+InetAddress.getByName(replace).getHostName());

            /*System.out.println("连接的主机名为："+InetAddress.getByName(socket.getInetAddress().toString()).getHostName());*/

            System.out.println("已连接" + (index++) + "客户端");
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getLocalAddress());


            while (true) {
                String str = br.readLine();
                if ("bye".equals(str)) {
                    break;
                }

                StringBuilder s = new StringBuilder(str);
                s.reverse();

                ps.println(s.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}




