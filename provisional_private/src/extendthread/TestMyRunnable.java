package extendthread;

public class TestMyRunnable {
    public static void main(String[] args) throws InterruptedException{
        //创建自定义类对象  线程任务对象
        MyRunnable mr = new MyRunnable();

        //创建线程对象
        Thread t = new Thread(mr,"长江");
        t.start();

        for (int i = 0; i < 20; i++) {
            Thread.sleep(10);
            System.out.println("黄河"+i);
        }
    }
}
