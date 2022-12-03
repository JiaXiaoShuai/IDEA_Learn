package com.jc.exer.exer5;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator {
    /**
     * 比较两个对象的大小（用int属性比较）
     * @param o1 传入一个类型为Employee的参数
     * @param o2 传入一个类型为Employee的参数
     * @return 负数：o1 < o2; 正数:o1 >o2; 0:o1 = o2
     */
    @Override
    public int compare(Object o1, Object o2) {
        return ((Employee)o1).getId() - ((Employee)o2).getId();
    }
}
