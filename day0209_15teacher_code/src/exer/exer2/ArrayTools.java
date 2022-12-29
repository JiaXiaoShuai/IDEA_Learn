package exer.exer2;

public class ArrayTools {
    /**
     * 返回数组的最大值
     *
     * @param arr int类型的数组
     * @return 返回数组中最大的元素
     */
    public static int max(int[] arr) {
        if(arr == null){
            throw new NullPointerException("数组不能为null");
        }

        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException("数组不能没有元素");
        }

        int index = 0;
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
        return arr[index];
    }

    /**
     * 判断数组元素是否从小到大排序
     * @param arr int类型数组
     * @return 是从小到大排序true，反之false
     */
    public static boolean fromSmallToLarge(int[] arr) {
        if(arr == null){
            throw new NullPointerException("数组不能为null");
        }

        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException("数组不能没有元素");
        }
        boolean index= true;
        o:for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] - arr[j] > 0) {
                    index = false;
                    break o;
                }
            }
        }
        return index;
    }

    public static int binarySearch(int[] arr,int value)throws RuntimeException{
        if(arr == null){
            throw new NullPointerException("数组不能为null");
        }

        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException("数组不能没有元素");
        }
        int index = -100;
        int a = 0;
        if(fromSmallToLarge(arr)==false){
            throw new RuntimeException("数组元素不是从小到大排序的");
        }else{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==value){
                  index = i;
                  a++;
                  break;
                }
            }

        }
        if(a == 1){
            return index;
        }else{
            return -1;
        }
    }

    public static String toString(int[] arr){
        if(arr == null){
            return "";
        }
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                str += arr[i];
            }else{
                str += "," + arr[i];
            }
        }
        str += "]";
        return str;
    }

}
