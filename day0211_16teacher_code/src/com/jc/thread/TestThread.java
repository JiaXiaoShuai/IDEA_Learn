package com.jc.thread;
/*
1.程序：
    是选择一种编程语言，完成一个功能或任务；而编写的一段代码，这段代码最后被编译或解释为指令
    程序是一组指令的合集
    程序是静态的，当我们电脑手机安装了一个程序后，只是占用硬盘或存储卡的空间
2.进程：
    一个程序的一次运行
    当程序启动后，操作系统都会给这个程序分配一个进行的ID，并且会给他分配一块独立的内存空间
    如果一个程序被启动了多次，那么会有多个进程。
    多个进程之间是无法共享数据
    如果两端代码需要数据的交互，成本比较高，要么通过一个硬盘的文件，要么通过网络。
    进程之间的切换成本比较高，现在的操作系统都支持多任务，操作系统在每一个任务之间进行切换，要给整个进程作镜像
    要记录当前进程的状态，执行到哪个指令
    操作系统分配资源的最小单位是进程
    每一个进程至少要有一个线程
3.线程：
    进程中的其中一条执行路径。多个线程会同属于一个进程
    这多个线程会同享同一个进程中的一些资源。比如Java中堆内存的数据，方法区的数据。
    如果同一个进程的两段代码需要进行数据交互，非常方便。可以直接在内存中共享，当然，同时要考虑安全问题
    线程之间的切换，需要记录信息要少很多，因为很多线程之间的数据是共享的，这些数据就不用单独在做镜像了，只需要记录每一个线程要执行的下一条指令
        CPU调度的最小单位是线程
JVM：
    (1)方法区
    （2）堆内存
    （3）java虚拟机栈
    （4）本地方法栈
    （5）程序计数器：记录每一个线程执行的下一条指令

Java程序一个main方法的程序，就一个进程。但是可以在main中，再开启多个线程。
Java程序后台有几个线程是默默运行：GC线程、异常的检查和处理线程、类加载器线程。
 */
public class TestThread {
}
