package anonymousinnerclass;

public class TestOut {
    public static void main(String[] args) {
        Out1 out = new Out1();
        out.print(3);
    }
}
class Out1 {
    private int a = 12;
    public void print(final int x) {
        class In {
            public void inPrint() {
                System.out.println(x);
                System.out.println(a);
            }
        }
        new In().inPrint();
    }
}
