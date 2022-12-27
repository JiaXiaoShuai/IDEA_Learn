package exception;

public class TestFinallyReturn1 {
    public static void main(String[] args) {
        int result = test("12");
        System.out.println(result);//1
    }

    public static int test(String str){
        try{
            Integer.parseInt(str);//不会发生异常
            return 1; //(1)先把1放到“操作数栈”中（2）再去执行finally(3)把“操作数栈”结果返回并结束test方法的执行
        }catch(NumberFormatException e){
            return -1;
        }finally{
            System.out.println("test结束");//一定会执行
        }
    }
}
