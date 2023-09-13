package com.jc.tcp.demo2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        Socket socket = server.accept();

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        PrintStream ps = new PrintStream(os);
        int n = 1;
        while(true){
            System.out.println("这是第"+(n++)+"回合");
            String str = br.readLine();
            System.out.println("服务器接收的消息是："+str);
            if("bye".equals(str)){
                break;
            }

            //字符串反转
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();

            //返回
            //为了对方接收时，可以按行处理，我这边也可以把反转的数据按行发送
            System.out.println("服务器发送的消息是："+sb);
            ps.println(sb.toString());
        }

        //while循环接收，说明客户端要关闭了
        ps.close();
        os.close();
        br.close();
        isr.close();
        is.close();
        socket.close();

        //如果后面也不接收其他客户端连接了，那么服务要关闭
        server.close();
    }
}
