package innerclass01;

public class TestLocalInner {
    public static void main(String[] args) {
        Runner runner = Outer.getRunner();
        runner.run();

        System.out.println("----------------------");
        Outer.outMethod();

        System.out.println("-----------------");
        Outer out = new Outer();
        out.outTest();
    }

}

class Outer {
    private static String a = "外部类静态变量a";
    private String b = "外部类对象的非静态变量b";

    public static void outMethod() {
        System.out.println("Outer.outMethod");
        final String c = "局部变量c";
        class Inner {
            public void inMethod() {
                System.out.println("Outer.inMethod");
                System.out.println("out.a = " + a);
//                System.out.println("out.b = "+b);//错误的，因为outMethod是静态的
                System.out.println("out.local.c = " + c);
            }
        }

        Inner in = new Inner();
        in.inMethod();
    }

    public void outTest() {
        class Inner {
            public void inMethod() {
                System.out.println("out.a = " + a);
                System.out.println("out.b = " + b);//可以，因为outTest是非静态的
            }
        }
        Inner in = new Inner();
        in.inMethod();
    }

    public static Runner getRunner() {
        class LocalRunner implements Runner {
            @Override
            public void run() {
                System.out.println("LocalRunner.run");
            }
        }
        return new LocalRunner();
    }
}

interface Runner {
    void run();
}
