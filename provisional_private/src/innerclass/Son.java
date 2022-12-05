package innerclass;

public class Son extends InnerClass.A {

    InnerClass in = new InnerClass();
    InnerClass.Ba b = in.new Ba();
}
