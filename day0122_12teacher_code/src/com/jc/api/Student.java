package com.jc.api;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int score;

    public String getName() {
        return name;
    }

    public Student() {
        super();//这句话可以省略，但是就算省略，它也存在
                //这句代码，在这里就是代码Object的无参构造
    }

    public Student(String name) {
        super();//这句话可以省略，但是就算省略，它也存在
        //这句代码，在这里就是代码Object的无参构造
        this.name = name;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //这是Ctrl + o 快捷键重写的toString方法
/*    @Override
    public String toString() {
        return super.toString();
    }*/
    //这是Alt + Insert快捷键重写的toString方法
    //这个类似于我们之前写的getInfo()方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {//形参是Object的话，实参对象可以是任意类型对象
        /*
        第一个if的意思是，如果当前对象和o对应的实参对象的 地址值相同，就直接返回true。不用看属性。就是自己和自己比较的时候。
         */
        if (this == o) {
            return true;
        }
        /*
        第二个if的意思是
        o==null，当前对象this是非空对象，而o对应的实参对象是null，非空对象与null比较一定是false
        getClass() != o.getClass()： 等价于 this.getClass() != o.getClass()
                当前对象的类型 和 o对应的实参对象的运行时类型 不一样，就返回false。
         */
        if (o == null || getClass() != o.getClass()) {
            return false;
        }


        /*
        把形参o向下转型为Student
        为什么要强转？
            因为要调用o对象中的成员变量，而o对象的编译时类型是Object，如果不向下转型，是无法访问age等

        o对象是什么类型？
        o对象的运行时类型不会变，而且一定是Student类型。  因为o对象如果是别的对象类型，那么上面的if就return回去了。
         */
        Student student = (Student) o;//student仍然表示o对应的实参对象，它们是同一个地址值

        return age == student.age &&  //比较当前对象this的age 和 o对应的实参对象的age比较
                score == student.score && //比较当前对象this的score 和 o对应的实参对象的score比较
                Objects.equals(name, student.name); //比较当前对象this的name和 o对应的实参对象的name比较
                //这里name比较没有用==，因为name是String类型，它使用了工具Objects类的一个equals方法比较

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }
}
