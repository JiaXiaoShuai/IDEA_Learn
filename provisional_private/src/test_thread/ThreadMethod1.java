package test_thread;

/**
 * run()方法和main（）方法同时修改同一个变量会如何？
 *
 * 但是如果多个run（）方法修改一个变量，取得是第一个？
 */
public class ThreadMethod1 {
     static int i;

     public static void method(){
         i = 199;
     }

    public static void main(String[] args) throws InterruptedException{

        /*int i = 1;*/


        SubThread sub = new SubThread();
        sub.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadMethod1.i = 2;
                System.out.println(ThreadMethod1.i);
            }
        }).start();


        /*new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadMethod1.i = 1;
                System.out.println(ThreadMethod1.i);
            }
        }).start();*/


        ThreadMethod1.method();
        System.out.println("最终结果："+ ThreadMethod1.i);

        Thread.sleep(5000);
        System.out.println("zuizuzi最终结果："+ ThreadMethod1.i);
    }
}

class SubThread extends Thread{
    public SubThread() {
    }

    public SubThread(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        ThreadMethod1.i = 22;
        System.out.println(ThreadMethod1.i);
    }
}