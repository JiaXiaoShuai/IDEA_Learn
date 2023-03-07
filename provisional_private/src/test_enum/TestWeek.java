package test_enum;

import java.sql.SQLOutput;

public class TestWeek {
    public static void main(String[] args) {
        Week week = Week.FRIDAY;
        System.out.println(week);
        System.out.println(Week.MONDAY);
        System.out.println("*********************************");

        System.out.println(week.name());
        System.out.println(week.ordinal());

        Week[] arr = Week.values();
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println("");
        System.out.println(Week.valueOf("SUNDAY"));
        switch(week){
            case FRIDAY:
                System.out.println("lalalal");
                break;
            case MONDAY:
                System.out.println("hahahha");
                break;
            case SUNDAY:
                System.out.println("guaguaguaugua");
                break;
        }
    }
}
