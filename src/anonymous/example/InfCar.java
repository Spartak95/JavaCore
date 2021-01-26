package anonymous.example;

public interface InfCar {
    void go();
    void stop();
    default void a1(){
      System.out.println("default a1 method");
    }
}

