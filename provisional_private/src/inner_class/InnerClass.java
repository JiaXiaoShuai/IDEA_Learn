package inner_class;

/**
 * 非静态内部类被继承需要引用外部类的构造方法，用外部类的对象调用super();
 * 继承了内部类的类无法重写外部类的方法，因为内部类和外部类是两个类
 */
public class InnerClass {

    public class K{
        int a;

        public void method(){
            System.out.println("内部类K的method方法");
        }

        /*public abstract void method(int a);*/
    }

    public void me(){

    }
}
