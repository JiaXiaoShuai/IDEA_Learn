package exception;

import org.junit.Test;

public class TestOutOfMemoryError {
    @Test
    public void test02(){
        //OutOfMemeryError
        //方式一：
        int[] arr = new int[Integer.MAX_VALUE];
    }

    @Test
    public void Test03(){
        StringBuilder s = new StringBuilder();
        while(true){
            s.append("idis");
        }
    }
}
