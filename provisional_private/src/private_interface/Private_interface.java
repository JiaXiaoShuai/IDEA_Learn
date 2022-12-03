package private_interface;

public class Private_interface {
    private String name;
    private int index;
    private int age;

    public Private_interface() {
    }

    public Private_interface(int index, int age) {
        this.index = index;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Children getChild() {
        return child;
    }

    public void setChild(Children child) {
        this.child = child;
    }

    public Children child;
}
