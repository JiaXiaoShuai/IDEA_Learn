package com.jc.linked;

/**
 * 链式结构
 * （1）先要有结点，双链表的特点：
 * class Node{
 *     Node previous;
 *     E data;
 *     Node next;
 * }
 *
 * (2)对于双链表来说：可以从前往后查找元素，也可以从后往前
 * 双链表最后记录一下：第一结点的地址和最后一个结点的地址
 */
public class MyLinkedList<E> {
    private Node first;//第一个结点的位置
    private Node last;//最后一个结点的位置
    private int total;

    public void add(E e){
        /*
        * 第一步：先创建新结点
        * */
        Node newNode = new Node(last,e,null);
        /*
        新结点的previous = last；（这里last是指没有添加当前新结点之前）
        如果是第一次添加，那么last是null
        如果是非第一次添加，那么last是有值的
         */

        /*
        第二步：让上一个结点的next指向的新结点
         */

        if (last != null){
            last.next = newNode;
        }else {
            first = newNode;
        }
        /*
        第三步：最后一个结点变成了是当前最新的结点
         */
        last = newNode;

        //元素个数增加
        total++;
    }

    public int size(){
        return total;
    }

    public void remove(E e){
        /*
        1.找到目标结点
         */
        Node node = findNode(e);
        if(node != null){
            if(node.previous == null){//说明被删除的是第一个结点
                first = node.next;
            }

            if(node.next == node){
                node.previous.next = node.previous;
            }

            node.previous.next = node.next;
        }else {
            System.out.println("没有该节点，无法删除");
        }
        total--;
    }

    public Node findNode(E e){
        if(e == null){
            Node node = first;
            while(node!=null){
                if(node.data == null){
                    return node;
                }
                node = node.next;
            }
        }else {
            Node node = first;
            while(node.data != null){
                if(e.equals(node.data)){
                    return node;
                }
            }
            node = node.next;
        }
        return null;
    }

    private class Node{
        Node previous;
        E data;
        Node next;

        public Node(Node previous, E data, Node next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }
    }
}
