package private_interface01;

public class TestEmployee {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employee em = new Employee("jia",23);

        Employee em1 = em;
        Object em2 = em.clone();
        System.out.println(em2);
        System.out.println(em == em2);
        System.out.println(em == em1);
        System.out.println(em.equals(em2));

        Employee employee01 = new Employee();
        Object obj01 = employee01;
        System.out.println(obj01);
        System.out.println(obj01==employee01);

    }
}
