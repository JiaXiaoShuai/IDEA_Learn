package exer;

public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new unicycle(1);
        System.out.println(v1);
        v1.drive();
        Vehicle v2 = new Bicycle(2);
        System.out.println(v2);
        v2.drive();
        Vehicle v3 = new Tricycle(3);
        System.out.println(v3);
        v3.drive();
    }
}
