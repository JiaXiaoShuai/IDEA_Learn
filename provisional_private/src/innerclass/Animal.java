package innerclass;

public class Animal {
    private int id;
    private String name;
    private String desc;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }
}
