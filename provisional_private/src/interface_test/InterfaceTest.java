package interface_test;

/**
 * 接口的使用方法和注意事项
 */
public interface InterfaceTest {
    int add(int a,int b);

    public abstract int down(int a);

    public abstract double down(double a);

    public default int upper(int a){
        return a;
    }

    public default int upp(int a){
        return a;
    }
}
