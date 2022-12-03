package private_interface;
/*
Comparable接口适用于在一个类里去重写这个借口，并且比较的也是该类产生的对象
在其它类生成也是可以，但是比较麻烦。
 */
public class Children implements Father,Mother{
    private String name;
    private int index;
    private int age;

    Private_interface pa = new Private_interface();//这个就是在其他类里生成的

    @Override
    public String toString() {
        return "Children类的toString方法被调用了";
    }

    @Override
    public int compareTo(Object o) {
        Private_interface child = (Private_interface) o;
        if(pa.getIndex() == child.getIndex()){
            return pa.getAge() - child.getAge();
        }
        return pa.getIndex()-child.getIndex();
    }
}
