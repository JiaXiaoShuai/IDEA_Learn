package inner;

/*
3、匿名内部类的使用
（1）匿名内部类的匿名对象.方法
（2）通过父类或父接口的变量 接收 匿名子类/匿名实现类的对象，然后多态调用
（3）把匿名内部类的匿名对象直接作为另一个方法调用的实参
 */
public class AnonymousInnerUse {
    public static void main(String[] args) {
        //方式一
        new Object(){
            void method(){
                System.out.println("匿名内部类的自定义方法method");
            }
        }.method();

        //方式二：
        Base b = new Base(){
            @Override
            public void method() {
                System.out.println("匿名内部类重写父类的抽象方法method");
            }

            @Override
            public void fun() {
                System.out.println("匿名内部类重写父类的抽象方法fun");
            }
        };
        b.method();
        b.fun();

        MyInter my = new MyInter(){

            @Override
            public void method() {
                System.out.println("匿名实现类实现接口的抽象方法method");
            }

            @Override
            public void fun() {
                System.out.println("匿名实现类实现接口的抽象方法fun");
            }
        };
        my.fun();
        my.method();

        //方式三：
        test(new Base() {
            @Override
            public void method() {
                System.out.println("另一个Base类的匿名子类重写method");
            }

            @Override
            public void fun() {
                System.out.println("另一个Base类的匿名子类重写method");
            }
        });

        System.out.println("--------------------");
    }

    public static void test(Base b){
        System.out.println("AnonymousInnerUse.test");
        b.method();
    }
}

abstract class Base{
    public abstract void method();
    public abstract void fun();
}

interface MyInter{
    void method();
    void fun();
}