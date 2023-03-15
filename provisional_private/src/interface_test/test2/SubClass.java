package interface_test.test2;

public class SubClass extends SuperClass implements SuperInterface,MotherInterface{

    public void method(){
        System.out.println(super.x);
        System.out.println(MotherInterface.x);
        System.out.println(SuperInterface.x);
        System.out.println(y);
    }
}
