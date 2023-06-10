package com.jc.exer;
/*
声明一个Person<T>类，包含姓名和伴侣属性，其中姓名是String类型，而伴侣的类型不确定，用T表示，
因为伴侣可以是Person，可以是Animal（例如：金刚），可以是Ghost鬼（例如：倩女幽魂），
可以是Demon妖（例如：白娘子），可以是Robot机器人（例如：剪刀手爱德华）。。。。
 */
public class Person<T> {
    private String name;
    private T mate;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, T mate) {
        this.name = name;
        this.mate = mate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getMate() {
        return mate;
    }

    public void setMate(T mate) {
        this.mate = mate;
    }


    @Override
    public String toString() {
        if(mate instanceof Person){
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lover=" + ((Person) mate).getName()  +
                    '}';
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", lover=" + mate  +
                '}';
    }
}
