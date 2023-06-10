package test_generic;

import java.util.Arrays;
import java.util.Comparator;

public class TestGenericClass2 {
    public static void main(String[] args) {
        Rectangle[] arr = new Rectangle[4];
        arr[0] = new Rectangle(3,9);
        arr[1] = new Rectangle(4.0,5.0);
        arr[2] = new Rectangle(6,2);
        arr[3] = new Rectangle(7,8);

        System.out.println("遍历原来顺序的数组");
        for(Rectangle rectangle : arr){
            System.out.println(rectangle);
        }
        
        
        //数组排序
        Arrays.sort(arr);

        Arrays.sort(arr, new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return Double.compare(o1.perimeter(),o2.perimeter());
            }
        });
        System.out.println("再次排序后：");
        for (Rectangle rectangle : arr) {
            System.out.println(rectangle);
        }
    }
}
