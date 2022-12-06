package anonymousinnerclass;

public class TestObject {
    public static void main(String[] args) {
        new Object(){
            public void print(){
                System.out.println("大傻奔");
            }
        }.print();
    }
}
