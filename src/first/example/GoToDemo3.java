package first.example;

public class GoToDemo3 {
    public static void main(String[] args) {
        one:
        for (int i = 1; i < 3; i++) {
            System.out.println(i + " քայլ");
        }
        for (int j = 0; j < 100; j++) {
            //if (j == 4) break one; // կառաջանա սխալ
            System.out.println("j = " + j);
        }
    }
}

