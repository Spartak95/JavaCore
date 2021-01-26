package test;

public class Start {
    public static void main(String[] args) {
        Start start = new Start();
        Car car = new Car("BMW");
        System.out.println("car.getName() = " + car.getName());
        start.test1(car);
        System.out.println("car.getName() = " + car.getName());
        start.test2(car);
        System.out.println("car.getName() = " + car.getName());
    }
    void test1(Car car1){
       car1.setName("Toyota");
        System.out.println("car1.getName() = " + car1.getName());
    }
    void test2(Car car2){
        car2 = new Car("NIVA");
        System.out.println("car2.getName() = " + car2.getName());
        test3(car2);
    }
    void test3(Car car3){
        car3 = new Car("KIA");
        System.out.println("car3.getName() = " + car3.getName());
    }
}

