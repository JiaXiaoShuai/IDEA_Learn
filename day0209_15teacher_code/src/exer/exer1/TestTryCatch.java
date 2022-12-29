package exer.exer1;

import static java.lang.Thread.sleep;

public class TestTryCatch {
    public static void main(String[] args) {
        for(int i = 10;i >= 1;i--){
            System.out.println(i);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("新年到！");
    }
}
