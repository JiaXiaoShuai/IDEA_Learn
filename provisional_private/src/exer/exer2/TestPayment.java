package exer.exer2;

public class TestPayment {
    public static void main(String[] args) {
        Payment[] values = Payment.values();
        for(int i = 0; i < values.length;i++){
            System.out.print(values[i]+":");
            values[i].pay();
        }
    }
}
