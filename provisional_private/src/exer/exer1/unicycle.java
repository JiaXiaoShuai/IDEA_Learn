package exer.exer1;

public class unicycle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("脚踏独轮车，摇摇摆摆往前走");
    }

    public unicycle(int wheels) {
        super(wheels);
    }
}
