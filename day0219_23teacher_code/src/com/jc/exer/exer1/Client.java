package com.jc.exer.exer1;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        ObjectOutputStream oos = null;
        BufferedReader br = null;

        BufferedInputStream bis = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(),8888);

            //给服务器发送文件名和文件内容
            oos = new ObjectOutputStream(socket.getOutputStream());

            //接收服务器反馈的结果
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //指定要上传的文件
            Scanner input = new Scanner(System.in);

            System.out.print("请输入要上传的文件路径：");
            String filePath = input.nextLine();
            File file = new File(filePath);

            //从本地文件读取文件内容
            bis = new BufferedInputStream( new FileInputStream(file));


            //分开发送文件名和文件内容
            //先发送文件名
            oos.writeUTF(file.getName());

            //发送文件内容
            byte[] data = new byte[1024];
            int len;
            while ((len = bis.read(data)) != -1) {
                oos.write(data, 0, len);
            }
            oos.flush();
            socket.shutdownOutput();//关闭输出通道，对方才能读取到-1标识

            System.out.println(br.readLine());
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {

                bis.close();
                oos.close();
                br.close();
                socket.close();
            } catch (IOException e) {//粗糙一点关闭
                e.printStackTrace();
            }
        }

    }
}
