package anonymousinnerclass;

public class TestThread {
    public static void main(String[] args) {
        new Thread("jia"){
            @Override
            public void run() {
                System.out.println(getName()+"在梦游");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("另一个");
            }
        }).start();
    }
}
