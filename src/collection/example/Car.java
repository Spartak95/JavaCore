package collection.example;

public class Car implements Comparable<Car>{
    private String name;
    public Car(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Car car = (Car) o;
        if (o == null) return false;
        return name.equals(car.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    @Override
    public String toString() {
        return "Car name = " + name;
    }

    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.name);
    }
}

