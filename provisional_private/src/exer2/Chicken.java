package exer2;

public class Chicken extends Bird implements Flyable{
    @Override
    public void eat() {
        System.out.println("小鸡吃虫子");
    }

    @Override
    public void fly() {
        System.out.println("鸡也可以短暂的飞行");
    }

    public void a(){

    }
    public void a(int a ){

    }

    public int a(int a,int b){
        return 0;
    }
}
