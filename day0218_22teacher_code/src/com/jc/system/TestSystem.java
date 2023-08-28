package com.jc.system;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * System类中有三个常量对象：
 * public final static InputStream in = null;
 * public final static PrintStream out = null;
 * public final static PrintStream err = null;
 *
 * public static void setIn(InputStream in)
 * public static void setOur(PrintStream out)
 * public static void setErr(PrintStream err)
 *
 * private static native void setIn0(InputStream in);
 * private static native void setOut0(PrintStream out);
 * private static native void setErr0(PrintStream err);
 */
public class TestSystem {
    @Test
    public void test02() throws IOException {
        System.setIn(new FileInputStream("22.txt"));
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }

    @Test
    public void test01(){
        InputStream in = System.in;
        PrintStream out = System.out;
        PrintStream err = System.err;

        out.println("hello");
        err.println("world");
    }
}
