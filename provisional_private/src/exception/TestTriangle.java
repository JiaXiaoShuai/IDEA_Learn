package exception;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t = null;
        try{
            t = new Triangle(2,2,3);
            System.out.println("三角形创建成功");
            System.out.println(t);
        }catch (NotTriangleException e){
            System.out.println("三角形创建失败");
            e.printStackTrace();
        }

        try{
            if(t != null){
                t.setA(1);
            }
            System.out.println("三角形边长修改成功");
        }catch (NotTriangleException e){
            System.out.println("三角形边长修改失败");
            e.printStackTrace();
        }

        System.out.println("能打印出来吗");
    }
}
