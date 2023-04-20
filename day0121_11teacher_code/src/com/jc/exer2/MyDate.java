package com.jc.exer2;

/*
（2）声明MyDate类型

- 有int类型的年，月，日属性，私有化，提供get/set方法
- 提供有参构造public MyDate(int year, int month, int day)
- 提供public String getInfo()，返回“xxxx年xx月xx日”
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getInfo(){
        return year +"年" + month + "月" +day +"日";
    }
}
