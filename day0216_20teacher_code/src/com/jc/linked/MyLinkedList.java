package com.jc.linked;

import java.util.Iterator;

/**
 * 链式结构
 * （1）先要有结点，双链表的特点：
 * class Node{
 * Node previous;
 * E data;
 * Node next;
 * }
 * <p>
 * (2)对于双链表来说：可以从前往后查找元素，也可以从后往前
 * 双链表最后记录一下：第一结点的地址和最后一个结点的地址
 */
public class MyLinkedList<E> implements Iterable<E> {
    private Node first;//第一个结点的位置
    private Node last;//最后一个结点的位置
    private int total;

    public void add(E e) {
        /*
         * 第一步：先创建新结点
         * */
        Node newNode = new Node(last, e, null);
        /*
        新结点的previous = last；（这里last是指没有添加当前新结点之前）
        如果是第一次添加，那么last是null
        如果是非第一次添加，那么last是有值的
         */

        /*
        第二步：让上一个结点的next指向的新结点
         */

        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        /*
        第三步：最后一个结点变成了是当前最新的结点
         */
        last = newNode;

        //元素个数增加
        total++;
    }

    public int size() {
        return total;
    }

    public void remove(E e) {
        /*
        1.找到目标结点
         */
        Node node = findNode(e);
        if (node != null) {
            if (node.previous == null) {//说明被删除的是第一个结点
                first = node.next;
            } else {
                node.previous.next = node.next;
            }

            if (node.next == null) {
                last = node.previous;
            } else {
                node.next.previous = node.previous;
            }


        }
        node.previous = null;
        node.data = null;
        node.next = null;
        total--;
    }

    public Node findNode(E e) {
        if (e == null) {
            Node node = first;
            while (node != null) {
                if (node.data == null) {
                    return node;
                }
                node = node.next;
            }
        } else {
            Node node = first;
            while (node.data != null) {
                if (e.equals(node.data)) {
                    return node;
                }
                node = node.next;
            }
        }
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        Node node = first;

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public E next() {
            E value = node.data;
            node = node.next;
            return value;
        }
    }

    public class Node {
        Node previous;
        E data;
        Node next;

        public Node(Node previous, E data, Node next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }

        /*public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }*/

   /* @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", total=" + total +
                ", data=" +
                '}';
    }*/
    }

}
