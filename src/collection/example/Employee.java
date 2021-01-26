package collection.example;

public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee - " + "name = " + name + ", salary = " + salary;
    }

    @Override
    public int compareTo(Employee e) {
        return getSalary().compareTo(e.getSalary());
    }
}


