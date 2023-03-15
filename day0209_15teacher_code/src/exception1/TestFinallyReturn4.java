package exception1;

public class TestFinallyReturn4 {
    public static void main(String[] args) {
        int result = test("12");
        System.out.println(result);
    }

    public static int test(String str){
        try{
            Integer.parseInt(str);//不发生异常
            return 1;//执行（1）先把1放到“操作数栈”中（2）再去执行finally
        }catch(NumberFormatException e){
            return -1;//不执行
        }finally{
            System.out.println("test结束");
            return 0;//执行 （1）先把0放到“操作数栈”中（2）把“操作数栈”结果返回并结束test方法的执行
        }
    }
}
