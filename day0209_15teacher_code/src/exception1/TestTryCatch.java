package exception1;
/*
1.语法格式
try{
    可能发生异常的代码
}catch（异常的类型  异常对象名称）{
    处理异常的代码
    处理方式：（1）输出打印异常的信息（2）进行相应的逻辑处理
}catch（异常类型  异常对象名称）{

}

2.注意
（1）多个catch，异常的类型如果是有父子类关系的话，一定是子类在上，父类在下
（2）catch（）中一定是异常的类型，不能是其他的类型
只有是Throwable及其子类类型才能作为catch（）的参数类型
（3）多个catch如果处理方式都一样，那么在JDK1.7之后，允许这么写

3.执行的特点
（1）如果try的{}中没有发生异常，那么一个catch都不会去匹配，相当于catch没有用上，直接执行try。。。catch结构下面的代码即可
（2）如果try的{}中发生了异常，try中剩下的代码就不能在执行了，在发生异常的位置会产生一个对象，并抛出
    A：catch分支会从上往下一次去检查，依次去尝试捕获这个异常对象，如果可以捕获到，那么就会继续执行try。。。catch结构下面的代码
    B：所有catch分支都无法匹配，如果不是main方法，就会把异常往上抛，如果是main，程序就挂了
 */
public class TestTryCatch {
    public static void main(String[] args) {
        try{
            int a= 1;
            int b = 0;
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            int result = a/b;//发生异常，try中剩下的代码就不再执行了 ArithmeticException
            System.out.println("result = "+result);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("后续代码");
    }
}
