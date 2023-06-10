package exception1;

/*
自定义一个异常，表示三边值不能组成三角形。
自定义异常的类型 NotATriangleException
 */
public class TestDefineException {
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(1,1,1);
            System.out.println("t = " + t);
        } catch (NotATriangleException e) {
            e.printStackTrace();
        }
    }
}
