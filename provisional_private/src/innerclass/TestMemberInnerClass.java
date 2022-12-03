package innerclass;

public class TestMemberInnerClass {
    public static void main(String[] args) {
        Outer.outMethod();
        System.out.println("________________________");
        Outer out = new Outer();
        out.outFun();

        System.out.println("################################");
        Outer.Inner.inMethod();
        System.out.println("-------------------------------");
        Outer.Inner inner = new Outer.Inner();
        inner.inFun();

        System.out.println("############################");
        Outer outer = new Outer();
        Outer.Nei nei = outer.new Nei();
        Outer.Nei nei1 = outer.getNei();
        nei1.inFun();
    }


}

class Outer{
    private static String a ="外部类的静态a";
    private static String b = "外部类的静态b";
    private String c = "外部类对象的非静态c";
    private String d = "外部类对象的非静态d";

    static class Inner{
        private static String a = "静态内部类的静态a";
        private String c = "静态内部类对象的非静态c";

        public static void inMethod(){
            System.out.println("Inner.inMethod");
            System.out.println("Outer.a = "+Outer.a);
            System.out.println("Inner.a = "+ a);
            System.out.println("b = "+b );
//            System.out.println(c);//不能访问外部类和自己的非静态成员（inMethod为静态方法）
        }

        public void intoA(){
            System.out.println(c);//可以直接访问自己的非静态成员
            //            System.out.println("d = " + d);//不能直接访问外部类的非静态成员
            System.out.println( new Outer().c);
//            System.out.println(Outer.this.c);//静态类里不能用this
        }


        public void inFun(){
            System.out.println("Inner.inFun");
            System.out.println("Outer.a = " + Outer.a);
            System.out.println("Inner.a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
//            System.out.println("d = " + d);//不能访问外部类的非静态成员
        }
    }

    class Nei{
        private String a = "非静态内部类对象的非静态a";
        private String c = "非静态内部类对象的非静态c";

        public void inFun(){
            System.out.println("Nei.inFun");
            System.out.println("Outer.a = " + Outer.a);
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("Outer.c = "+ Outer.this.c);
            System.out.println(new Outer().c);
            System.out.println("d = " + d);
        }
    }

    public static void outMethod(){
        System.out.println("Outer.outMethod");
        System.out.println("a = " + a);
        System.out.println("Inner.a = " + Inner.a);
        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
        Inner in = new Inner();
        System.out.println("in.c = " + in.c);
    }

    public void outFun(){
        System.out.println("Outer.outFun");
        System.out.println("a = "+ a);
        System.out.println("Inner.a" + Inner.a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        Inner in = new Inner();
        System.out.println("in.c = "+ in.c);
    }

    public Nei getNei(){
        return new Nei();
    }
}
