package anonymousinnerclass;

public class TestOutIn {
    public static void main(String[] args) {
        Out.In in = new Out().new In();
        in.print();
    }
}
class Out {
    private int a = 12;
    class In {
        private int a = 13;
        public void print() {
            int a = 14;
            System.out.println("局部变量：" + a);
            System.out.println("内部类变量：" + this.a);
            System.out.println("外部类变量：" + Out.this.a);
        }
    }
}
