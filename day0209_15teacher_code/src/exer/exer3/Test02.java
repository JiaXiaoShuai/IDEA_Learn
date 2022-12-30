package exer.exer3;

public class Test02 {
    {
        System.out.println("a");
    }
    static{
        System.out.println("b");
    }
    void Test03(){
        System.out.println("c");
    }
    public static String getOut(){
        try{
            return "1";
        }catch(Exception e){
            return "2";
        }finally{
            return "3";
        }
    }
    public static void main(String[] args) {
        System.out.println(getOut());
        Test02 te = new Test02();
        Test02 te1 = new Test02();
    }
}