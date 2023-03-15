package exception1;

/*
1.异常类型的根：java.langThrowable
Throwable作为类的根仍然Object

Throwable 类是Java语言中所有错误或异常的超类
只有当对象是此类（或其子类之一）的实例时，才能通过Java虚拟机或者Java throw语句抛出
类似地，只有此类或其子类之一才可以是catch子句中的参数类型。

2.Throwable有两个大子类
Error：错误，用于只是合理的应用程序不应该试图捕获的严重问题
    例如：VirtualMachineError(虚拟机错误)
    OutOfMemoryError(堆内存溢出)，StackOverflowError（堆内存溢出）
    这种错误，要么进行硬件升级，要么进行JVM优化，要么进行系统优化
Exception：异常，指出了合理的应用程序想要捕获的条件

3.Exception：又可以分为两大类
运行时异常：RuntimeException及其子类，非受检异常。
编译时异常：除了运行时异常，剩下的都是编译时异常

如何区分是编译时异常类型还是运行时异常类型
1.看类的继承关系图
2.看编译器的态度
编译器会提示你某个异常会发生，那么就是编译时异常
编译器压根不提示，无论是否发生，那不提示，就是运行时异常

 */
public class TestExceptionType {
    public static void main(String[] args) {
//        FileNotFoundException f = new FileNotFoundException("找不到文件");
//        throw f;
        ArrayIndexOutOfBoundsException a = new ArrayIndexOutOfBoundsException();
        throw a;

//        System.out.println("jajaja");
    }
}
