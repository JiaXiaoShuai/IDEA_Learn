package exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = { 34, 12, 67 };
        int num = ArrayTools.getElement(arr, 4);
        //这句代码从getElement方法中获得了非正常的返回值，而是得到了一个异常对象
        //后台有一个异常检测和处理的程序，会先检测这句代码的外围有没有try...catch
        //结构能够“捕获catch”这个异常对象，如果没有，就会把这个异常对象接着“抛throw"
        //如果已经是最后的main了，那么程序就中断，崩溃了
        System.out.println("num=" + num);
        System.out.println("over");
    }
}
