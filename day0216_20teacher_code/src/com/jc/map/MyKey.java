package com.jc.map;

import java.util.Objects;

public class MyKey {
    private int num;

    public MyKey(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MyKey{" +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey = (MyKey) o;
        return num == myKey.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
