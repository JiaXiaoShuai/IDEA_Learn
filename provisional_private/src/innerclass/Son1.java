package innerclass;

public class Son1 extends InnerClass.Ba {
    String son1Name = "Son1的非静态son1Name";
    static String son1Name2 = "Son1的静态son1Name2";
    static InnerClass ina = new InnerClass();

    {
        System.out.println("Son1的非静态代码块");
    }

    static {
        System.out.println("Son1的静态代码块");
    }

    public Son1(){
        ina.super();
        System.out.println(son1Name2);
        System.out.println(son1Name);
        System.out.println("Son1构造方法");
    }

    public static void main(String[] args) {
        Son1 son1 =new Son1();
    }
}
