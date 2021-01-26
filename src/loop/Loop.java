package loop;

public class Loop {
    public static void main(String[] args) {
        outer: for (int i = 0; i<3; i++){
            System.out.println("Քայլ " + i + ":");
            for (int j = 0; j<100; j++){
                if (j==10) break outer;
                System.out.println(j + " ");
            }
            System.out.println("Այս տողը չի տպվի");
        }
        System.out.println("Ցիկլը ավարտվեց");
    }
}
