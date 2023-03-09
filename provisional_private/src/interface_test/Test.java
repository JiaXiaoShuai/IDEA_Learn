package interface_test;

public class Test extends A implements InterfaceTest{

    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    @Override
    public double down(double a) {
        return 0;
    }

    @Override
    public int down(int a) {
        return 0;
    }

    public static void main(String[] args) {
        InterfaceTest test = new Test();
        System.out.println(test.add(3,5));
    }
}
