package junit;

import org.junit.Test;
/*
@Test注解，标记的方法有严格的要求：
（1）所在类必须是public的类，而且只能有唯一的无参构造方法
（2）@test标记的方法必须是public，void，（）的方法，非静态的
 */


public class TestJunit {

    @Test
    public void te(){
        System.out.println("hello world");
    }
}
