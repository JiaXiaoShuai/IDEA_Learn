package com.jc.review;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
java.util.Properties类：
    它的key和value都是String类型的

 */
public class TestReview {
    @Test
    public void test01(){
        Properties properties = System.getProperties();
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }
    }

    @Test
    public void test02() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("info.properties"));//文件字节输入流
        //相对路径，对于JUnit来说，相对于当前的模块
        //        对于main来说，相对于当前的project
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));

    }

    @Test
    public void test03() throws Exception{
        Properties properties = new Properties();
        //properties.load(new FileInputStream("src/jdbc.properties"));//文件字节输入流
        //上面的写法在开发阶段没有问题，但是生产环境（上线后）有问题，因为部署项目后，是没有src源代码文件夹
        properties.load(TestReview.class.getClassLoader().getResourceAsStream("jdbc.properties"));
        //TestReview.class.getClassLoader()
        // （1）TestReview.class先得到 TestReview这个类的Class对象
        //（2）TestReview.class.getClassLoader()然后再通过Class对象获取加载它的类加载器对象
        //（3）通过类加载器对象，取读取classpath路径下的资源文件
        //classpath就是out目录下的 class文件的目录
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }

    @Test
    public void test04(){
        System.out.println(ClassLoader.getSystemClassLoader());
        //sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}
