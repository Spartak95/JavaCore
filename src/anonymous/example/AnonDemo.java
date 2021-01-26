package anonymous.example;

public class AnonDemo {
    public static void main(String[] args) {
        InfCar ic = new InfCar() {

            @Override
            public void go() {
                System.out.println("Մեքենան շարժվում է");
            }

            @Override
            public void stop() {
                System.out.println("Մեքենան կանգնում է");
            }

        };
        ic.go();
        ic.stop();
    }
}

