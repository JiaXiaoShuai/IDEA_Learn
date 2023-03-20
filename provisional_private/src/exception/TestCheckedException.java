package exception;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCheckedException {
    @Test
    public void test06() throws InterruptedException{
        Thread.sleep(1000);//休眠1秒
    }

    @Test
    public void test07() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("Java学习秘籍");
    }

    @Test
    public void test08() throws SQLException {
        Connection conn = DriverManager.getConnection("....");
    }
}
