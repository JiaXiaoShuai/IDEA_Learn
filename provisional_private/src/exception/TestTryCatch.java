package exception;

public class TestTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
            System.out.println(args[1]);
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = a/b;
            System.out.println(result);
        }catch (NumberFormatException e){
            System.out.println("数字格式不正确，请输入");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数字格式不正确，请输入两个整数");
        }catch (ArithmeticException e){
            System.out.println("第二个整数不能为0");
        }

        System.out.println(args.length);
        System.out.println(111111);
        System.out.println();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println();
    }
}
