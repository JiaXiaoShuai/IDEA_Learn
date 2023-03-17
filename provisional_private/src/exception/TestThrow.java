package exception;

public class TestThrow {
    public static void main(String[] args) {
        try{
            System.out.println(max(4,3,23,1));
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            System.out.println(max(4));
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            System.out.println(max());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int max(int... nums){
        if(nums == null || nums.length==0){
            throw new IllegalArgumentException("没有传入任何整数，无法获取最大值");
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
