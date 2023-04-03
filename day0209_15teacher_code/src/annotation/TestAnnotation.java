package annotation;

/*
回忆：
Java是强类型语言：
Java的数据类型：
（1）基本数据类型和void：
byte,short,int,long,float,double,char,boolean
（2）引用数据类型
数组、类、接口、枚举（一种特殊的类）、注解

1、什么是注解（Annotation）？
形式：@注解名

例如：@Override

2、注解的作用？
注解是一种注释，但和我们之前学习的注释不同。

 */

//单行注释：//
//多行注释：/* */
// 文档注释：/** */

import java.util.Date;

/*
之前学习的注释，是给人看的。程序会忽略它。
现在讲的注解，除了给人看，更重要的是给“编译器”或其他的程序看的。由编译器或其他程序读取，然后做相应的处理。
虽然它不会改变程序的逻辑，但是它可以给程序添加一些“描述性，辅助性”的信息。

例如：@Override

它是一种代码级别的注释。

3、系统最早，基本的三个注解
（1）@Override：用于检测被标记的方法为有效的重写方法，如果不是，则报编译错误!

重写方法的要求：
A：方法名：必须相同
B：形参列表：必须相同
C：返回值类型：
    基本数据类型和void：必须相同
    引用数据类型：<=
D：权限修饰符：>=，而且不能是private
E：注意static，final，private等修饰的方法是不允许被重写的。

（2）@Deprecated：标记某个方法、类等已过时
不建议程序员继续使用，如果使用有问题，或有风险。

（3）@SuppressWarnings：标记某个方法、类等抑制警告
 */
public class TestAnnotation {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Father f = new Son();
        Object obj = f.getObj();//编译时按照父类处理，父类getObj方法的返回值类型是Object，用Object变量接收是可以的
        //运行时按子类重写方法处理，实际返回的是String类型的对象，这里是安全的

        System.out.println("--------------------------");
        Date date = new Date();//日期
        System.out.println(date);//Wed Feb 09 10:25:00 CST 2022

        Date d = new Date(2022-1900,2-1,4);
        System.out.println(d);//Sat Mar 04 00:00:00 CST 3922
                             //Fri Feb 04 00:00:00 CST 2022
        //year参数是指  year-1900年的差值
        //month参数是指 月份值 - 1
    }
}
@SuppressWarnings("all")
class Father{
    public void method(){
        System.out.println("父类的方法");
    }
    public int fun(){
        return 0;
    }

    public static void test(){
        System.out.println("父类的静态方法");
    }

    protected Object getObj(){
        return new Object();//只是为了保证语法正确
    }
}
@SuppressWarnings("all")
class Son extends Father{
    @Override
    public void method() {
        super.method();
    }

    /*@Override
    public double fun(){//违反了重写方法时，返回值类型如果是基本数据类型，必须一致
        return 0.0;
    }*/

    /*@Override
    protected int fun(){//违反了重写方法时，权限修饰符必须>=
        return 0;
    }*/

    /*@Override
    public static void test(){ //违反了静态方法不能被重写
        System.out.println("子类的静态方法");
    }*/

    @Override
     public String getObj(){
        return new String();//只是为了保证语法正确
    }
}
