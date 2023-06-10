package inner;

/*
第四种内部类：匿名内部类
1、语法格式
（1）new 父类(){
    类的成员列表
}

（2）new 父类(实参列表){
    类的成员列表
}

（3）new 父接口(){
     类的成员列表
}

语法格式的解释：
（1）因为匿名内部类是没有名字，这个类没有名字，就只能是一次性的，只有唯一的对象，必须在声明类的同时就把对象创建好，
否则后期就无法创建它的对象。
即声明类的同时就把对象创建好了。这句代码既声明了一个类，又创建了一个对象。

（2）因为匿名内部类是没有名字，所以创建对象时，只能用父类名或父接口名表示。
同时表明了，新的匿名内部类的父类是谁，或父接口是谁。
new 父类(){           //等价于  class 匿名子类  extends 父类{}
    类的成员列表
}
new 父类(实参列表){       //等价于  class 匿名子类  extends 父类{}
    类的成员列表
}

new 父接口(){  //这种格式，它的父类是Object，实现父接口  //等价于  class 匿名子类  extends Object implements 父接口{}
     类的成员列表
}

（3）子类在继承父类时，一定要在子类构造器的首行调用父类的构造器。
new 父类(){  //等价于在匿名子类的构造器首行有 super()
    类的成员列表
}

new 父类(实参列表){//等价于在匿名子类的构造器首行有 super(实参列表)
    类的成员列表
}

new 父接口(){  //等价于在匿名子类的构造器首行有 super()，而且是表示调用Object类的无参构造
     类的成员列表
}


2、匿名内部类的成员
除了静态成员之外，其他成员都可以有。
但是构造器无法手动编写，只能由编译器自动产生。因为类没有名字，就无法编写构造器，构造器名字必须和类名一致。

但是通常情况下，匿名内部类一般不会有很多成员，而且一般不会定义自己的成员，通常都是重写父类或父接口的成员。

匿名内部类也是局部内部类，所有的使用限制啥的，和局部内部类一样。


 */
public class AnonymousInner {
    public static void main(String[] args) {

        new Object();//创建Object类的对象，没有产生新的类，使用已有的java.lang.Object类

        new Object(){//创建Object的匿名子类对象，会产生新的类，对应有AnonymousInner$1.class

        };

        new Father(){//创建Father类的匿名子类对象，调用父类的无参构造

        };

        new Father("尚硅谷"){//创建Father类的匿名子类对象，调用父类的有参构造

        };

        new Cloneable(){ //创建Cloneable接口的匿名实现类对象，调用父类无参构造

        };
    }
}

abstract class Father{
    private String info;
    Father(){
        System.out.println("父类的无参构造");
    }
    Father(String info){
        this.info = info;
        System.out.println("父类的有参构造");
    }
}