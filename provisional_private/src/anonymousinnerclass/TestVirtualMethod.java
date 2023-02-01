package anonymousinnerclass;

/**
 * 虚方法
 */
public class TestVirtualMethod {
    public static void main(String[] args) {
        MyClass my = new MySub();
        Father f = new Father();
        Son s = new Son();
        Daughter d = new Daughter();
        my.method(f);
        my.method(s);
        my.method(d);
    }
}
