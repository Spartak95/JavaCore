package collection.example;

import java.util.*;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        CompName cn = new CompName();
        //TreeSet<Employee> tm = new TreeSet<Employee>(cn);
        TreeSet<Employee> tm = new TreeSet<Employee>();
        tm.add(new Employee("Ջոն Դոու", 23000));
        tm.add(new Employee("Թոմ Սմիթ", 46000));
        tm.add(new Employee("Ջեյն Բեյկեր", 32000));
        tm.add(new Employee("Տոդ Հալլ", 120000));
        tm.add(new Employee("Ռալֆ Սմիթ", 45000));
        Iterator<Employee> iterator = tm.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
