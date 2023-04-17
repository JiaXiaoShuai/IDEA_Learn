package com.jc.stringbuffer;

/**
 * String类的对象是不可变的，如果程序中涉及到对“字符串”经常修改（拼接、替换等），
 * 那么使用String类反而效率较低
 *
 * 可变字符串，或者叫做可变字符序列：java.lang.StringBuffer和java.lang.StringBuilder，字符串缓冲类
 * StringBuffer和StringBuilder的区别？
 * StringBuffer：最早的字符串缓冲区类，是线程安全的
 * StringBuilder：JDK1.5之后引入，相对较新，线程不安全的
 *      因为绝大多数时候，StringBuilder和StringBuffer的对象都是被单个线程使用，而不是多线程
 *      单线程不存在安全问题，就没有必要加同步锁，加锁反而降低性能
 *
 * String和StringBuffer和StringBuilder的区别？
 * String是不可变的字符串对象
 * StringBuffer和StringBuilder是可变的字符串对象
 *
 * 方法：（以StringBuilder为例，对于StringBuffer的话，只要把StringBuilder替换成StringBuffer就行了）
 * （1）构造器
 * StringBuilder和StringBuffer不能直接用“”赋值。必须new对象，因为“”只能是String类型。
 * 他们三个之间没有父子类关系，所以不能直接类型转换
 *
 *
 * （2）方法
 * public StringBuilder append（xx）：
 * public StringBuilder insert(int offset,String str):
 * public StringBuilder replace(int start,int end,String str):
 * public StringBuilder reverse():
 * public StringBuilder delete(int start,int end)
 * public StringBuilder deleteCharAt(int index)
 * public void setCharAt(int index,char ch):
 * 只要是修改字符串的方法，返回值类型仍然是StringBuilder，那么意味着可以“连写”
 *
 * char charAt(index)
 * int indexOf(xx)
 * int lastIndexOf(xx)
 * int length()
 *
 *
 */
public class TestStringBuffer {
}
