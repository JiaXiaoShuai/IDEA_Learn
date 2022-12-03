package com.jc.api;

/*
（5）protected void finalize() throws Throwable ：
修饰符：protected，可见性范围是本类、本包（java.lang）、其他包的子类。
throws Throwable：先忽略它，它是异常章节学习的内容。

作用：
    当垃圾回收器（GC)确定不存在对该对象的更多引用（确定某个对象是垃圾对象）时，
    由对象的垃圾回收器调用此方法。子类重写 finalize 方法，以配置系统资源或执行其他清除。

结论：
    这个方法不是由程序员调用的，是GC调用，自动调用。
    如果子类要重写它，目的只有一个：配置系统资源或执行其他清除。
    系统资源：IO流、数据库连接等

补充：
    每一个对象的finalize方法会被调用几次？
    肯定是一次。
    就算对象在finalize方法中被复活了，下次GC就不调用它的finalize方法了。

    finalize被设计的作用是用于 资源占用内存的清理。
    finalize方法被设计为只调用一次，是为了避免僵尸对象的出现，这是从安全方面考虑的。

 */
public class MethodFinalize {
    public static void main(String[] args) throws Exception {
        for (int i=1; i <=10; i++){
            MyDemo my = new MyDemo(i);
            //my是局部变量，有作用域，
            //每一次循环my就会指向新的对象，那么上次的对象就没有变量引用它了，就成垃圾对象
        }

        System.gc();//通知GC来回收一下垃圾对象，通常这个方法是不用我们调用，GC有自己的工作节奏
                    //我们不知道它什么时候来，这里就强制让它工作一下。
        Thread.sleep(5000);//这个方法的作用是让当前程序先歇会，5000毫秒，就是5秒。
    }
}

class MyDemo{
    private int value;

    public MyDemo(int value) {//构造器
        this.value = value;
    }

    @Override
    public String toString() {//返回对象的信息
        return "MyDemo{" + "value=" + value + '}';
    }

    //重写finalize方法，让大家看一下它的调用效果
    @Override
    protected void finalize() throws Throwable {
//        正常重写，这里是编写清理系统内存的代码
//        这里写输出语句是为了看到finalize()方法被调用的效果
        System.out.println(this+ "轻轻的走了，不带走一段代码....");
    }
}
