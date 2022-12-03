package com.jc.enumtype;

/*
为什么要用枚举类型？
1、没有枚举类型时，遇到这样的问题时，如何解决的？
订单有各种状态：
0，未付款,
1，已付款
2，已发货,
3，已收货
4，退款中,
5，订单取消
...

在数据库中会怎么表示？
    在数据库中有一列值表示订单状态，用什么数据呢？
    可以是字符串，也可以是整数。
    字符串的字数多，整数占用的空间少。
在程序中怎么表示？
    程序中按理应该和数据库中的数据对应。

 */
public class TestEnumType {
    public static void main(String[] args) {
        Order order1  = new Order(0);
        Order order2  = new Order(Status.NO_PAY);//可读性更好

        Order order3 = new Order(ZhuangTai.NO_PAY);//可读性更好
    }
}
class Order{
    ///...其他属性省略
    private int status;//状态
    private ZhuangTai zhuangTai;//状态

    public Order(int status) {
        this.status = status;
    }

    public Order(ZhuangTai zhuangTai) {
        this.zhuangTai = zhuangTai;
    }
}
class Status{
    public static final int NO_PAY = 0;
    public static final int HAS_PAY = 1;
    public static final int HAS_SEND = 2;
    //...

}

enum ZhuangTai{
    NO_PAY(0,"未付款"),
    HAS_PAY(1,"已付款"),
    HAS_SEND(3,"已发货")
    //...
    ;

    private int value;
    private String description;

    ZhuangTai(int value, String description) {
        this.value = value;
        this.description = description;
    }
}