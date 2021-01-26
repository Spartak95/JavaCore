package collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaSort {
    public static void main(String[] args)
    {
        ArrayList<Employee_2> employees = getUnsortedEmployeeList();
        Comparator<Employee_2> compareByName = Comparator
                .comparing(Employee_2::getFirstName)
                .thenComparing(Employee_2::getLastName);
        Collections.sort(employees, compareByName);
        for (Employee_2 e : employees){
            System.out.println(e);
        }
    }

    private static ArrayList<Employee_2> getUnsortedEmployeeList() {
        ArrayList<Employee_2> list = new ArrayList<>();
        list.add( new Employee_2(2, "Lokesh", "Gupta") );
        list.add( new Employee_2(1, "Alex", "Gussin") );
        list.add( new Employee_2(4, "Brian", "Sux") );
        list.add( new Employee_2(5, "Neon", "Piper") );
        list.add( new Employee_2(3, "David", "Beckham") );
        list.add( new Employee_2(7, "Alex", "Beckham") );
        list.add( new Employee_2(6, "Brian", "Suxena") );
        return list;
    }
}
