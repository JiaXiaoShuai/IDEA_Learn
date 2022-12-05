package private_interface01;

public class TestInner{
    public static void main(String[] args){
        Outer.Inner in = new Sub();
        in.method();//输出 hello inner
    }
}

class Outer {
    abstract class Inner{
        abstract void method();
    }
}
class Sub extends Outer.Inner{
    static Outer out = new Outer();
    Sub(){
        out.super();
    }

    @Override
    void method() {
        System.out.println("hello inner");
    }

}
