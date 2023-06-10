package com.jc.exer1;

/*
（2）声明子类：Student类，继承Person类

- 新增属性：score成绩，属性私有化，
- 包含get/set方法
- 提供无参构造public Student()
- 提供有参构造public Student(String name, int age, char gender, int score)
- 重写getInfo()方法：例如：姓名：张三，年龄：23，性别：男，成绩：89
 */
public class Student  extends Person{
    private int score;

    public Student() {
    }

    public Student(String name, int age, char gender, int score) {
        super(name, age, gender);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "，成绩：" + score;
    }
}
