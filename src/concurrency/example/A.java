package concurrency.example;

public class A {
    public static void main(String[] args) {
        int[] num = {-7, 25, 125, 5, 15, 102};
        int[] nnum = new int[8];
        int as = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] % 5 == 0){
                nnum[as++] = num[i];
                nnum[as++] = 5;
            }
        }
        for (int a:nnum) {
            System.out.print(a + " ");
        }
    }
}
