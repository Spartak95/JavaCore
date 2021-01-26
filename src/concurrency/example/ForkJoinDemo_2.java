package concurrency.example;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo_2 {
    public static void main(String[] args) {
        // ստեղծվում է հոսքերի պուլը
        ForkJoinPool fjp = ForkJoinPool.commonPool();
        double[] nums = new double[10000];
        // զանգվածի էլեմենտներին վերագրում է արժեքներ
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }
        System.out.println("Ելակետային հաջորդականության հատվածը");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);
        task.invoke();
        System.out.println("Վերափոխված հաջորդականության հատվածը");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.4f ", nums[i]);
        }
        System.out.println();
    }
}

