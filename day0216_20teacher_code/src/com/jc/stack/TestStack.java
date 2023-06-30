package com.jc.stack;

import org.junit.Test;

import java.util.Stack;

/**
 * Stack就是顺序栈，它是Vector的子类
 */
public class TestStack {

    @Test
    public void test02(){
        Stack<String> stack = new Stack<>();
        stack.push("hello");
        stack.push("java");
        stack.push("world");

        System.out.println(stack.peek());//查看当前栈顶元素，但是不弹出
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println(stack.search("hell"));//search查询元素所在位置（从1开始），如果没有则返回-1
    }

    @Test
    public void test01(){
        Stack<String> stack = new Stack<>();
        stack.push("hello");//push压栈
        stack.push("java");
        stack.push("world");

        System.out.println(stack);

        System.out.println(stack.pop());//弹栈，弹出栈顶元素
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());//EmptyStackException空栈异常
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
