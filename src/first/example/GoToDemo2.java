package first.example;

public class GoToDemo2 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i < 3; i++) {
            System.out.println(i + " քայլ");
            for (int j = 0; j < 100; j++) {
                if (j == 4) break outer;
                System.out.println("j = " + j);
            }
            System.out.println("Այս տողը չի կատարվի");
        }
        System.out.println("Ցիկլը ավարտվեց");
    }
}

