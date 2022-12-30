package exer.exer4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
            int m = 0;
            switch (t){
                case 1:
                    System.out.println("lalala");
                    break;
                case 2:
                    System.out.println("oooo");
                    break;
                default:
                    m = 1;
                    System.out.println("hahahah");
                    break ;
            }
            if(m == 1){
                break;
            }

        }
    }
}
