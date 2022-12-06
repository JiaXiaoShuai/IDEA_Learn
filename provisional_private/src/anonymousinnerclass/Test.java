package anonymousinnerclass;

public class Test extends Thread{
    public Test(String name) {
        super(name);
        System.out.println(getName());
    }

    public static void test(A a){
        a.a();
    }
    public static void main(String[] args) {
        ((A) () -> System.out.println("aaaa")).a();

        A obj = () -> System.out.println("aaa");

        obj.a();

        test(() -> System.out.println("a"));

        test(new A() {
            @Override
            public void a() {
                System.out.println("a");
            }
        });
    }
}

interface  A{
    void a();
}
