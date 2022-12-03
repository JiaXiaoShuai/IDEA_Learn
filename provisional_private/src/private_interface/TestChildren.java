package private_interface;

public class TestChildren {
    public static void main(String[] args) {
        /*Private_interface pr = new Private_interface();
        *//*pr.child = new Children();
        String a = pr.child.toString();
        System.out.println(a);*//*
        pr.child.toString();
        pr.child.notify();*/

        Children children = new Children();

        Private_interface pr = new Private_interface(33,20);

        children.pa = new Private_interface(33,100);

        System.out.println(children.compareTo(pr));

    }
}
