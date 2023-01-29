package linshi;

/**
 * continue结束本循环开始下一次循环，可以提高代码效率
 */
public class Test02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 1||i == 3||i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
