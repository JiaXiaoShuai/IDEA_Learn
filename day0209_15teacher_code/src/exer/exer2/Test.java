package exer.exer2;

public class Test {
    public static void main(String[] args) {
        int[] a = {1,0,2,3,5};
        int index = ArrayTools.max(a);
        System.out.println(index);

        boolean b = ArrayTools.fromSmallToLarge(a);
        System.out.println(b);

        int i = 0;
        try{
            i = ArrayTools.binarySearch(a,0);
            System.out.println(i);
        }catch (RuntimeException e){
            System.out.println(i);
        }

        int[] arr = {1,5,16,28,39};

        try {
            System.out.println(ArrayTools.toString(arr));
            System.out.println("最大值：" + ArrayTools.max(arr));
            System.out.println("查找5：" + ArrayTools.binarySearch(arr,5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
