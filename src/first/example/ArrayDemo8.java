package first.example;

public class ArrayDemo8 {
    public static void main(String[] args) {
        int[][] m = {
           {1*2, 1*3, 2*6, 3*5},
           {1*1, 1*8, 2*6, 8*9},
           {3*6, 7*8, 0*6, 4*9},
           {3*1, 5*8, 2*6, 8*9},
           {7*8, 3*8, 3*7, 2*5}
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

