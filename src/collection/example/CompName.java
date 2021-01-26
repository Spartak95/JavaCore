package collection.example;

import java.util.Comparator;

public class CompName implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee employee_2) {
        return employee.getName().compareTo(employee_2.getName());
    }
}

