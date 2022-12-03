package com.jc.block;

import com.jc.constructor.User;

/*
(非静态)代码块
1.作用:是用来给“实例变量”初始化的
2.意义:把多个构造器中的代码抽取出来，写到代码块中，减少代码冗余
3.执行特点：
代码块中的代码会自动执行
当new时，自动执行，new一次执行一次
案例：

（1）声明User类，
- 包含属性：username（String类型），password（String类型），registrationTime（long类型），私有化
- 包含get/set方法，其中registrationTime没有set方法
- 包含无参构造，
  - 输出“新用户注册”，
  - registrationTime赋值为当前系统时间，
  - username就默认为当前系统时间值，
  - password默认为“123456”
- 包含有参构造(String username, String password)，
  - 输出“新用户注册”，
  - registrationTime赋值为当前系统时间，
  - username和password由参数赋值
- 包含public String getInfo()方法，返回：“用户名：xx，密码：xx，注册时间：xx”
    提示： System类有一个可以获得当前系统时间的方法
    long   System.currentTimeMillis()：具体1970 0.0.0 0时间差
（2）编写测试类，测试类main方法的代码如下：
 */
public class TestBlock {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("chai","1111");
    }

}

