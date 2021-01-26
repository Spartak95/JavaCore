package first.example;

public class ForEachDemo4 {
    public static void main(String[] args) {
        int nums[][] = new int[3][5];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = k;
                k++;
            }
        }
        for (int[] x : nums) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}

