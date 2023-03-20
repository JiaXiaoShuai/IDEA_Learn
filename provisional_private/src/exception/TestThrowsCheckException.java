package exception;

public class TestThrowsCheckException {
    public static void main(String[] args) {
        System.out.println("上课");
        try{
            afterClass();
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("准备提前上课");
        }
        System.out.println("上课");

    }
    public static void afterClass() throws InterruptedException{
        for (int i = 10; i >= 1 ; i--) {
            Thread.sleep(1000);
            System.out.println("距离上课还有："+i+"分钟");
        }
    }
}
