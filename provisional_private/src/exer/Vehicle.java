package exer;

public abstract class Vehicle {
    private int wheels;//轮子数量

    public Vehicle() {
    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                '}';
    }


}
