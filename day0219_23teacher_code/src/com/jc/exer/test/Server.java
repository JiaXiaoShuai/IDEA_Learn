package com.jc.exer.test;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/*
需求：每一个客户端启动后都可以给服务器上传一个文件；服务器接收到文件后保存到一个upload目录中，可以同时接收多个客户端的文件上传。

思考分析：
（1）服务器端要“同时”处理多个客户端的请求，那么必须使用多线程，每一个客户端的通信需要单独的线程来处理。
（2）服务器保存上传文件的目录只有一个upload，而每个客户端给服务器发送的文件可能重名，所以需要保证文件名的唯一。我们可以使用“时间戳”作为文件名，而后缀名不变
（3）客户端需要给服务器上传文件名（含后缀名）以及文件内容。而文件名是字符串，文件内容不一定是纯文本的，因此选择ObjectOutputStream和ObjectInputStream。
 */
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(8888);

        Socket socket = server.accept();

        InputStream inputStream = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(inputStream);

        byte[] data = new byte[10];
        ois.read(data);
        System.out.println(Arrays.toString(data));

        ois.close();
        inputStream.close();
        socket.close();
    }
}
