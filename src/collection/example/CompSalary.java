package collection.example;

import java.util.Comparator;

public class CompSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee employee_2) {
        return employee.getSalary().compareTo(employee_2.getSalary());
    }
}

