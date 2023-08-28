package com.jc.object;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

public class TestOne {
    @Test
    public  void test01() throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("Test.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s1 = new Student("李四", 24, 0);
        Student s2 = new Student("王五", 24, 0);
        Student s3 = new Student("赵六", 24, 0);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        oos.writeUTF("我是字符串");
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        oos.writeObject(arr);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("Test.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readUTF());
        System.out.println(ois.readObject());


        /*while(true){
            try{
                Object obj = ois.readObject();
                System.out.println(obj);
            }catch (EOFException e){
                System.out.println("碰到了文件流读取末尾异常");
                break;
            }

        }*/

        ois.close();
        fis.close();
        System.out.println("流关闭执行了");
    }

    @Test
    public void test02() throws IOException{
        FileOutputStream fos = new FileOutputStream("Test.dat",true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s1 = new Student("李四", 24, 0);
        Student s2 = new Student("王五", 24, 0);
        Student s3 = new Student("赵六", 24, 0);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        oos.close();
        fos.close();
        System.out.println("李四添加成功");
    }

    @Test
    public void test03() throws IOException{
        FileOutputStream fos = new FileOutputStream("Test.dat",true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s1 = new Student("jia", 24, 0);
        Student s2 = new Student("jia", 24, 0);
        Student s3 = new Student("jia", 24, 0);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        oos.close();
        fos.close();
        System.out.println("jia添加成功");
    }

    @Test
    public void test04() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Test.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());

        ois.close();
        fis.close();
    }
}
