package review;

public class TestReview {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};

/*        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        for (int num : arr) {//每次循环，数组会把元素复制给num
            num = num * 2;
        }

        for (int num : arr) {
            System.out.println(num);  //num 等价于上面的 arr[i]
        }
    }
}
