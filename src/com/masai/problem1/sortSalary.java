package com.masai.problem1;
import java.util.*;

public class sortSalary implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(((Employee) o1).getSalary() < ((Employee) o2).getSalary()) {
            return -1;
        } else {
            return 1;
        }
    }

}
