package anonymousinnerclass;

public class MyClass {
    public void method(Father f){
        System.out.println("father");
    }

    public void method(Son s){
        System.out.println("son");
    }
}

class MySub extends MyClass{
    @Override
    public void method(Father f) {
        System.out.println("mysub--father");
    }

    public void method(Daughter d){
        System.out.println("mysub--daughter");
    }
}

class Father{

}

class Son extends Father{

}

class Daughter extends Father{

}