package annotation;

import java.util.ArrayList;

/**
 * 注解
 */
public class TestAnnotation {
    @SuppressWarnings("all")
    public static void main(String[] args){
        int i;

        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(123);
        list.add("world");
        System.out.println("hello");

        Father f = new Son();
        f.methodol();
        f.show();

        Son son =new Son();
        son.show();

    }

}
class Father{
    @Deprecated
    void show(){
        System.out.println("Father.show");
    }
    void methodol(){
        System.out.println("Father Method");
    }
}

class Son extends Father{
    @Override
    void methodol() {
        System.out.println("Son Method");
    }
}
