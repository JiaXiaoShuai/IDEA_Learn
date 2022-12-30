package exer.exer2;

public class ArrayTools {
    private static void checkArr(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("数组不能为null");
        }

        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("数组不能没有元素");
        }
    }


    /**
     * 返回数组的最大值
     *
     * @param arr int类型的数组
     * @return 返回数组中最大的元素
     */
    public static int max(int[] arr) {
        /*if(arr == null){
            throw new NullPointerException("数组不能为null");
        }

        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException("数组不能没有元素");
        }*/
        checkArr(arr);
        /*int index = 0;
        o:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] - arr[j] < 0) {
                    continue o;
                }
            }
            index = i;
            break;
        }
        return arr[index];*/

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * 判断数组元素是否从小到大排序
     *
     * @param arr int类型数组
     * @return 是从小到大排序true，反之false
     */
    public static boolean fromSmallToLarge(int[] arr) {
       /* if(arr == null){
            throw new NullPointerException("数组不能为null");
        }

        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException("数组不能没有元素");
        }*/
        checkArr(arr);
        /*boolean index = true;
        o:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] - arr[j] > 0) {
                    index = false;
                    break o;
                }
            }
        }
        return index;*/

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static int binarySearch(int[] arr, int value){
        /*if(arr == null){
            throw new NullPointerException("数组不能为null");
        }

        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException("数组不能没有元素");
        }*/

        checkArr(arr);
        if (fromSmallToLarge(arr) == false) {
            throw new RuntimeException("数组元素不是从小到大排序的");
        }

        for(int left = 0,right = arr.length-1; left<=right; ){
            int mid = left + (right-left)/2;
            if(arr[mid] == value){
                return mid;
            }else if(value > arr[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return -1;
    }

    public static String toString(int[] arr) {
        if (arr == null) {
            return "";
        }
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                str += arr[i];
            } else {
                str += "," + arr[i];
            }
        }
        str += "]";
        return str;
    }

}
