package com.jc.api.live;

public class TestFinalize {
    private static MyDemo[] arr =  new MyDemo[10];
    private static int total;

    public static void add(MyDemo demo){
        arr[total++] = demo;
    }

    public static void main(String[] args) throws Throwable{
        for (int i=1; i <=10; i++){
            MyDemo my = new MyDemo(i);
            //每一次循环my就会指向新的对象，那么上次的对象就没有变量引用它了，就成垃圾对象
        }

        //为了看到垃圾回收器工作，我要加下面的代码，让main方法不那么快结束，因为main结束就会导致JVM退出，GC也会跟着结束。
        System.gc();//如果不调用这句代码，GC可能不工作，因为当前内存很充足，GC就觉得不着急回收垃圾对象。
        //调用这句代码，会让GC尽快来工作。
        Thread.sleep(5000);//单位是毫秒，让当前程序休眠5秒再结束


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//MyDemo的对象还在，没有被回收掉，因为在回收过程中被复活了
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;//让这些元素不引用MyDemo的对象，这些对象再次称为垃圾对象
            System.out.println(arr[i]);
        }
        arr = null;

        System.gc();//再次让GC工作，使得MyDemo的对象再次被回收
        Thread.sleep(5000);//单位是毫秒，让当前程序休眠5秒再结束
    }
}

class MyDemo{
    private int value;

    public MyDemo(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyDemo{" + "value=" + value + '}';
    }

    //重写finalize方法，让大家看一下它的调用效果
    @Override
    protected void finalize() throws Throwable {
//        正常重写，这里是编写清理系统内存的代码
//        这里写输出语句是为了看到finalize()方法被调用的效果
        System.out.println("我轻轻的走了，不带走一段代码....");

        TestFinalize.add(this);
        //把当前对象this放到一个数组中，这样就有变量引用它，当前对象就不能被回收了
        //当下次this对象再次称为垃圾对象之后，GC就不会调用它的finalize()方法了
    }
}
