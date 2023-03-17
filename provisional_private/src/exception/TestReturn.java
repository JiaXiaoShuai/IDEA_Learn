package exception;

public class TestReturn {
    public static void main(String[] args) {
        int result = test("str");
        System.out.println(result);
    }

    public static int test(String str){
        try{
            Integer.parseInt(str);
            return 1;
        }catch (NumberFormatException e){
            return -1;
        }finally{
            System.out.println("test结束");
            /*return 2;*/
        }
    }
}
