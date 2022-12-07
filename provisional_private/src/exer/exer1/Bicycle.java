package exer.exer1;

public class Bicycle extends Vehicle{
    public Bicycle(int wheels) {
        super(wheels);
    }

    @Override
    public void drive() {
        System.out.println("脚踏自行车，悠哉悠哉往前走");
    }
}
