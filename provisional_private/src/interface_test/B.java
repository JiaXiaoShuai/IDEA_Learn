package interface_test;

public interface B {
    public default int upper(int a){
        return a;
    }

    public default int upp(int a){
        return a;
    }
}
