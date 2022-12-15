package innerclass;

public class Goose extends Animal {

    private static String desc;
    private String name;
    private int age;
    /*private String desc = "jsk";*/


    public Goose(String name, int age) {
        super(name);
        this.age = age;
    }

    public Goose(int id, String name, int age) {
        super(id, name, desc);
        this.age = age;
    }

   /* @Override
    public void eat() {
        super.eat();
    }*/

    public static void main(String[] args) {
        Goose goose = new Goose(1,"jia",23);
        Animal animal =new Goose(2,"cong",22);
    }
}
