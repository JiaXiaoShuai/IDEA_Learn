package anonymousinnerclass;

/**
 * 测试不创建对象调用类的静态方法时，非静态代码块是否执行，执行几次
 */

/*
 *①经过测试可得，不创建对象，调用静态方法时，非静态代码块中的代码不执行，
 *②静态代码块是在类加载时就会出现
 *
 */
public class B {
    public B(){
        System.out.println("无参构造");
    }

    public static void method(){
        System.out.println("B类的静态方法");
    }

    {
        System.out.println("非静态代码块");
        {
            System.out.println("非静态代码块中的非静态代码块");
        }
    }

    static{
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {

    }
}
