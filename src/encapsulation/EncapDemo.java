package encapsulation;

public class EncapDemo {

    public static void main(String[] args) {
        String carName;
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setName("Audi");
        car2.setName("BMW");

        carName = car1.getName();
        System.out.println("car1 " + carName);

        carName = car2.getName();
        System.out.println("car2 " + carName);
    }

}

