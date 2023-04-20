package exception1;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) throws NotATriangleException {
        if(a<=0 || b<=0 || c<=0 || a+b<=c || b+c<=a || a+c<=b){
            throw new NotATriangleException(a+","+b+","+c+"三边的值不能构成三角形");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
