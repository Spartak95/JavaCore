package exception.example;

public class Exc {
    public static void main(String[] args) {
        try{
           int a = 0;
           int b = 12 / 0;
            System.out.println("Այս տողը չի կատարվի");
        } catch (ArithmeticException e) {
            System.out.println("Չի կարելի թիվը բաժանել զրոյի վրա");
        }
    }
}

