package interface_test;

public interface TestInterface extends InterfaceTest,B,C{
    @Override
    int add(int a, int b);

    @Override
    double down(double a);

    @Override
    int down(int a);

    @Override
    default int upp(int a) {
        return B.super.upp(a);
    }

    @Override
    default int upper(int a) {
        return C.super.upper(a);
    }
}
