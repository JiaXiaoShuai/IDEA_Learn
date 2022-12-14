package extendthread;

public class TestMyThread {
    public static void main(String[] args) {
        //创建自定义线程对象
        MyThread mt = new MyThread("新的线程");

        //开启新线程
        mt.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程！"+i);
        }

    }
}
