package com.jc.exer3;
/*
先对类进行组装分析：
class Base{

   <init>() {
        //super(); 本题中可以忽略
        System.out.println("base");
        this.method(100);
    }
    public void method(int i){
        System.out.println("base : " + i);
    }
}

class Sub extends Base{
    <init>(){
        super();//这句话，要时刻记得它
        System.out.println("sub");
        super.method(70);
    }

    public void method(int j){
        System.out.println("sub : " + j);
    }
}

执行的代码是：

     System.out.println("base");
      this.method(100);//method是虚方法，我们现在在newSub类对象，所以执行重写的method
             System.out.println("sub : " + j);
     System.out.println("sub");
     super.method(70); //method虽然是虚方法，但是这里有明确说执行父类被重写的method，因为前面有super.
            System.out.println("base : " + i);
 */
public class Test2 {
    public static void main(String[] args) {
        Sub s = new Sub();
    }
}
class Base{
    Base(){
        this.method(100);
    }
    {
        System.out.println("base");
    }
    public void method(int i){
        System.out.println("base : " + i);
    }
}
class Sub extends Base{
    Sub(){
        super.method(70);
    }
    {
        System.out.println("sub");
    }
    public void method(int j){//是重写，虽然参数名不一样，但是参数的类型和个数一样，方法名也一样是重写
        System.out.println("sub : " + j);
    }
}
