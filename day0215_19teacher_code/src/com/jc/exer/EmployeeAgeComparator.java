package com.jc.exer;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int index = Integer.compare(o1.getAge(),o2.getAge());
        int a = Collator.getInstance(Locale.CHINA).compare(o1.getName(),o2.getName());
        return index == 0?a:index;
    }
}
