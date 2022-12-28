package exception;
/*
如果方法签名中有throws，对于方法重写有什么影响？
  （1）如果父类或父类接口被重写方法，没有throws“编译时异常“，重写方法时，就不能throws编译时异常，但可以throws运行时异常
  （2）如果父类或父类接口被重写方法，有throws“编译时异常”
  A：重写方法时，可以不throws编译时异常
  B：重写方法是，可以throws编译时异常，但是要求<=被重写方法的异常类型
  C：对于运行时异常来说，没有限制

  总结：运行时异常，编译器不管
        编译时异常，<=
 */

/*
(1)方法名相同；形参列表相同，返回值类型相同
    基本数据类型和void必须相同
    引用数据类型：<=
(2)权限修饰符：>=，而且要求父类被重写方法在子类中是可见的
(3)不能是static，final修饰的方法
 */
public class TestOverride {
    public static void main(String[] args) {

    }
}

class Father{
    public void method()throws Exception{

    }
}

class Son extends Father{
    @Override
    public void method() {

    }
}