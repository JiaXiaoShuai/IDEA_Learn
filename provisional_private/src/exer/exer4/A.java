package exer.exer4;

import javax.jws.Oneway;

public class A extends B{
    private B[] b = new B[3];
    private int total =0;
    public void add(B b){
        this.b[total++] = b;
    }
}
