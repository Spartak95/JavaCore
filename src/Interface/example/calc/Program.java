package Interface.example.calc;

public class Program {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));
    }
}

