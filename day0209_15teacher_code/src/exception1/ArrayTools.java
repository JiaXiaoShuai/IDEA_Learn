package exception1;

public class ArrayTools {
    // 对给定的数组通过给定的角标获取元素。
    public static int getElement(int[] arr, int index) {
        int element = arr[index];
        //这句代码发生异常时，程序就会在这里先停下来，创建一个对应类型的对象
        //当index超过[0,arr.length-1]时，就会创建一个ArrayIndexOutOfBoundsException对象
        //JVM会被这个异常对象 "抛throw"，抛出来
        //后台有一个异常检测和处理的程序，会先检测这句代码的外围有没有try...catch
        //结构能够“捕获catch”这个异常对象，如果没有，就会把这个异常对象接着“抛throw"
        //给调用者
        return element;
    }
}
