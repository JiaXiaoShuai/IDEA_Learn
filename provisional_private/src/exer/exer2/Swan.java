package exer.exer2;

public class Swan extends Bird implements Flyable,Swimming{
    @Override
    public void eat() {
        System.out.println("天鹅吃水生植物的根茎和和种子、水生昆虫、螺类和小鱼");
    }

    @Override
    public void fly() {
        System.out.println("天鹅展翅高飞");
    }

    @Override
    public void swim() {
        System.out.println("天鹅游泳清理自己的毛发");
    }
}
