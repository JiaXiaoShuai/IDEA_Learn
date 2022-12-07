package exer.exer2;

public class Penguin extends Bird implements Swimming{
    @Override
    public void eat() {
        System.out.println("企鹅吃南极磷虾");
    }

    @Override
    public void swim() {
        System.out.println("企鹅下海捉虾");
    }

}
