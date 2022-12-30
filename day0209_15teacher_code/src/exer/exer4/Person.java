package exer.exer4;

public class Person {
    private String name;
    private  double lifeValue;

    public Person(String name, double lifeValue) {
        this.name = name;
        this.lifeValue = lifeValue;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(double lifeValue) {
        if(lifeValue < 0){
            throw new NoLifeValueException("生命值不能为负");
        }
        this.lifeValue = lifeValue;
    }

    @Override
    public String toString() {
        if(lifeValue < 0){
            throw new NoLifeValueException("生命值不能为负");
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
