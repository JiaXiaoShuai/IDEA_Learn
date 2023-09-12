package com.jc.exer.exer1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
需求：每一个客户端启动后都可以给服务器上传一个文件；服务器接收到文件后保存到一个upload目录中，可以同时接收多个客户端的文件上传。

思考分析：
（1）服务器端要“同时”处理多个客户端的请求，那么必须使用多线程，每一个客户端的通信需要单独的线程来处理。
（2）服务器保存上传文件的目录只有一个upload，而每个客户端给服务器发送的文件可能重名，所以需要保证文件名的唯一。我们可以使用“时间戳”作为文件名，而后缀名不变
（3）客户端需要给服务器上传文件名（含后缀名）以及文件内容。而文件名是字符串，文件内容不一定是纯文本的，因此选择ObjectOutputStream和ObjectInputStream。
 */
public class Server {
    public static void main(String[] args)throws Exception {
        ServerSocket server = new ServerSocket(8888);

        while(true) {
            Socket socket = server.accept();
            new FileUploadThread(socket).start();
        }
    }
}

class FileUploadThread extends Thread{
    private Socket socket;

    public FileUploadThread(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        /*
        1、从客户端接收什么？
        （1）文件内容
        （2）文件名？
        关键时文件的“后缀名”，用于标识文件的类型。是图片还是视频还是xx。
        文件名本身可以保留，也可以不要。如果直接使用原文件名，因为大家上传的文件都保持在同一个文件夹中upload，就会“重名”问题，互相覆盖。

        2、那么如何避免文件重名呢？
        （1）方案一：每个用户有单独的文件夹（比较高级），必须有用户、会员机制
        （2）方案二：把文件名用一些时间戳+IP等来唯一标识一个文件

        3、文件名是字符串类型，而文件内容不一定，可能纯文本文件，可能是其他任意类型的文件，
        那么如何区分接收的数据，是文件名还是文件的内容。
        可以使用DataInputStream或ObjectInputStream
        因为它们有  String readUTF()，也支持  int read(byte[] data)
         */
        BufferedOutputStream bos = null;
        ObjectInputStream dis = null;
        PrintStream ps = null;
        try
        {
            dis = new ObjectInputStream(socket.getInputStream());
            ps = new PrintStream(socket.getOutputStream());
            //接收文件名
            String fileName = dis.readUTF();
//            String ext = fileName.substring(fileName.lastIndexOf("."));

            String newFileName = System.currentTimeMillis() + "&" + socket.getInetAddress().getHostAddress() + "&" + fileName;
            bos = new BufferedOutputStream(new FileOutputStream(new File("upload", newFileName)));

            //接收文件内容
            byte[] data = new byte[1024];
            int len;
            while((len=dis.read(data)) != -1){
                bos.write(data,0,len);
            }
            bos.flush();

            //也可以给客户端反馈消息，说接收完毕
            ps.println(fileName + "接收完毕");


        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                bos.close();
                dis.close();
                ps.close();
                socket.close();
            } catch (IOException e) {//粗糙一点关闭
                e.printStackTrace();
            }
        }

    }
}