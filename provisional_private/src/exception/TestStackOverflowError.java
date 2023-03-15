package exception;

import org.junit.Test;

public class TestStackOverflowError {
    @Test
    public void test01(){
        //StackOverflowError
        digui();
    }

    public void digui(){
        digui();
    }
}
