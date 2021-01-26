package first.example;

public class BreakDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " քայլ");
            for (int j = 0; j < 100; j++) {
                if (j == 4)  break;
                System.out.println("j = " + j);
            }
            System.out.println();
        }
        System.out.println("Ցիկլը ավարտվեց");
    }
}

