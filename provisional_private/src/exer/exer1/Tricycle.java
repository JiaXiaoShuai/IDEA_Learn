package exer.exer1;

public class Tricycle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("脚踏三轮车，稳稳当当往前走");
    }

    public Tricycle(int wheels) {
        super(wheels);
    }
}
