package com.jc.reflect;

/**
 * 类加载器：
 * 1.类加载器的类型   ClassLoader类
 *
 * （1）引导类加载器：负责加载最最核心的类库，例如：JRE的核心类库中的rt.jar等
 *  引导类加载器不是Java语言实现的，所以在Java中得不到它的对象
 *
 *  （2）扩展类加载器：负责加载JRE目录下lib文件中的ext扩展库
 *  （3）应用程序类加载器：负责程序员自己编写的类、接口等
 *  例如：TestClassLoader是我们自己写的
 *  （4）自定义类加载器：
 *      通常情况下我们是不需要自定义类加载器，
 *      但是如果你的系统有如下两种情况可以自定义类加载器
 *      A：字节码文件需要加密
 *      自定义类加载器在加载类的过程中先解密，然后再创建Class对象等。
 *      B：自定义的类或者类路径是在特殊的，特定的路径，和平时其他项目的类路径不同
 *      例如：tomcat服务器，他的classes是放在 WEB——INF/classes文件夹
 *      有的系统是把字节码文件放在网络中的某个数据库中，或者是某台文件服务器，和程序运行不在一个服务器
 *
 * 2.这些类加载器是如何一起工作？咱们这里主要讨论（1）（2）（3）
 * 他们之间的工作模式被称为“双亲委托模式”
 * 双亲：
 *      生活中：父母双亲
 *     这里是：parent属性
 *         每一个类加载器都有一个parent属性，记录父加载器
 * A：当系统需要加载某个类时，同时应用程序类加载器在接到任务，例如：java.lang.String类型
 * B：应用程序类加载器接到任务后，会先在方法区搜索这个类的Class对象，如果找到了，说明这个类已经被加载过了
 * 那么就直接返回它的Class对象，不会重复加载
 * 如果没有找到这个类的Class对象，会把这个任务先提交给“父“加载器，
 * 应用程序加载器的父加载器就是扩展类加载器
 *
 * C：
 * 扩展类加载器接到任务后，会在方法区搜索这个类的Class对象，如果找到了，说明这个类已经被加载过了
 * 那么就直接返回这个类的Class对象，不会重复加载
 * 如果没有找到这个类的Class对象，会把这个任务先提交给“父”加载器
 * 应用程序加载器的父加载器就是引导类加载器，也称为根加载器
 * D：引导类加载器接到任务后，会在方法区搜索这个类的Class对象，如果找到了，说明这个类已经被加载过了
 * 那么就直接返回他的Class对象，不会重复加载
 * 如果没有找到，会把自己负责的区域加载这个类，例如它负责rt.jar
 * 如果找到了，就返回它的class对象
 * 如果没有找到，就把任务往回传，传给扩展类加载器
 * E：扩展类加载器在接到父类传回的任务后，会在它负责的目录下加载这个类，例如jre/lib/ext
 * 如果找到了，就返回它的class对象，
 * 如果没有找到，就把任务往回传，传给应用程序类加载器
 * F:应用程序类加载器接到了父加载器的任务，就会在他负责的目录下加载这个类，例如：项目路径下（idea中就是out目录）
 * 如果找了，就返回它的class对象，
 * 如果没有找到，就报错ClassNotFoundException
 *
 * 为什么要设计的如此麻烦？
 * 目的：为了安全
 *
 * 例如：我自己写一个类，叫做java.lang.String
 *
 * 3、获取某个类的类加载器对象
 * 通过这个类的Class对象.getClassLoader()
 *
 */
public class TestClassLoader {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("java.lang.String");
        ClassLoader loader = c.getClassLoader();
        System.out.println(loader);//null   因为根加载器底层不是java代码，而是C

        Class c2 = Class.forName("com.jc.reflect.TestClassLoader");
        ClassLoader loader2 = c2.getClassLoader();
        System.out.println(loader2);//sun.misc.Launcher$AppClassLoader@18b4aac2

        Class c3 = Class.forName("sun.security.pkcs11.Token");
        ClassLoader loader3 = c3.getClassLoader();
        System.out.println(loader3);//sun.misc.Launcher$ExtClassLoader@19469ea2

        Class c4 = Class.forName("com.jc.demo.TestJc");
        ClassLoader loader4 = c4.getClassLoader();
        System.out.println(loader4);
        //loader4 = sun.misc.Launcher$ExtClassLoader@2f2c9b19

    }
}
