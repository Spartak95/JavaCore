package first.example;

public class GoToDemo {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second: {
               third: {
                   System.out.println("Այս տողը նախորդում է break օպերատորին");
                   if (t) break second;
                   System.out.println("Այս տողը չի կատարվի");
               }
                System.out.println("Այս տողը չի կատարվի");
            }
            System.out.println("Այս տողը կատարվում է");
        }
    }
}


