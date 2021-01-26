package collection.example;

import java.util.*;

public class FIOSortDemo {
    public static void main(String[] args) {
        CompName cfn = new CompName();
        Comparator<Employee> compare = cfn.thenComparing(new CompSalary());
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ջոն",  15000));
        employees.add(new Employee("Թոմ", 98000));
        employees.add(new Employee("Ջոն", 56000));
        employees.add(new Employee("Թոմ", 69000));
        employees.add(new Employee("Ռալֆ", 35000));
        Collections.sort(employees, compare);
        for (Employee e : employees){
            System.out.println(e);
        }
    }
}

