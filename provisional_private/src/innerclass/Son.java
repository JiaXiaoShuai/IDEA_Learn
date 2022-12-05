package innerclass;

public class Son extends InnerClass.Ba {
    static InnerClass in = new InnerClass();
    private  InnerClass a;

    public Son(){
        in.super();
    }


    InnerClass.Ba b = in.new Ba();
}
