package object.example;

public class Start {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car("BMW");
        Car car3 = new Car("KIA");
        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car3));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}


