package exer.exer3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
/*
抓取到异常后，后续的catch就不在继续抓了，直接运行后面的代码
 */
public class Test05 {
    public static int aMethod(int i)throws Exception{
        try{
            return i / 10;
        }catch(Exception ex){
            throw new Exception("exception in aMethod");
        }finally{
            System.out.println("finally");
        }
    }

    public static void method(){
        try{
            int a = 0;
            int b = 1;
            System.out.println(b/a);
        }catch(ArithmeticException ex){
            System.out.println("ArithmeticException");
        }catch(RuntimeException e){
            System.out.println("RuntimeException");
        }
        finally {
            System.out.println(1111);
        }
    }
    public static void main(String[] args) {
        try {
            aMethod(0);
        } catch (Exception e) {
            System.out.println("exception in main");
        }

        method();
    }
}
