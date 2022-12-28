package exception;

/*
 throws是加在方法()后面的。
 throw是在方法体中，一个语句，用于手动抛出一个异常对象。
 */
public class TestThrow {
    public static void main(String[] args) {

        try {
            System.out.println(max());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int max(int... nums)throws IllegalArgumentException{
        if(nums == null || nums.length<1){
            throw new IllegalArgumentException("必须传入至少一个整数");
            //可以代替return语句，返回一个异常对象
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
