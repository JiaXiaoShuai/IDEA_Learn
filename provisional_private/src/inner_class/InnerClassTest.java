package inner_class;

public class InnerClassTest extends InnerClass.K {
    public InnerClassTest(InnerClass innerClass) {
        innerClass.super();
    }

    @Override
    public void method() {
        super.method();
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        InnerClassTest in = new InnerClassTest(innerClass);
        in.method();
    }
}

/*static*/ class AB{
    //static只能修饰内部类
}