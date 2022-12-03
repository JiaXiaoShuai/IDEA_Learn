package com.jc.constructor;

public class User extends C{
    private String username;//用户名
    private String password;//密码
    private long registrationTime;//注册时间
    //long 类型，记录系统时间的毫秒值，比较大的一个整数

    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
    }

    public User(){
       /* System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();//返回值long类型*/
        username = registrationTime+"";//热河数据类型的值与字符串进行“拼接+”结果为String类型
        password = "123456";
    }

    public User(String username, String password) {
//        System.out.println("新用户注册");
        this.username = username;
        this.password = password;
//        registrationTime = System.currentTimeMillis();
    }

    public  String getInfo(){
        return "用户名:"+username+",密码:"+password;
    }
}

class C{
    public C(){
        System.out.println("C构造方法执行了");
    }
}