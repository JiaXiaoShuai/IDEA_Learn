package innerclass;

public class B extends A{
    private boolean a;

    static private int age;

    public B() {
    }

    public B(int id, String name, boolean a) {
        super(id, name,age);
        this.a = a;
    }
}
