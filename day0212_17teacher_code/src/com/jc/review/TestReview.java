package com.jc.review;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestReview {
    @Test
    public void test1()throws IOException {

        Scanner input = new Scanner(new FileInputStream("names.txt"));
        ArrayList<String> list = new ArrayList<>();
        while(input.hasNextLine()){
            list.add(input.nextLine());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("开始答题：");
        Random random = new Random();
        while(true){
            int index = random.nextInt(list.size());
            System.out.println(list.remove(index));
            System.out.print("是否继续(y/n):");
            char confirm = scanner.next().charAt(0);
            if(confirm=='n' && confirm=='N'){
                break;
            }
        }
    }
}
