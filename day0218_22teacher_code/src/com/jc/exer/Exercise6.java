package com.jc.exer;

import org.junit.Test;

import java.io.*;
import java.nio.Buffer;

public class Exercise6 {
    @Test
    public void test01() throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("22.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        BufferedWriter bw = new BufferedWriter(osw);

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }
        br.close();
        isr.close();
        fis.close();
        bw.close();
        osw.close();
        fos.close();


    }
}
