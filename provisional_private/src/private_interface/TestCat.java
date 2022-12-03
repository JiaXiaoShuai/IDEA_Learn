package private_interface;

public class TestCat {
    public static void main(String[] args) {
        Cat cat01 = new Cat(23,"ji");
        Object obj = new Cat(23,"jia");

        CatScoreComparator cs = new CatScoreComparator();
        cs.compare(cat01,obj);
        System.out.println(cs.compare(cat01,obj));
    }
}
