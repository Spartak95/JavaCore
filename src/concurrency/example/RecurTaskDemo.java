package concurrency.example;

import java.util.concurrent.ForkJoinPool;

public class RecurTaskDemo {
    public static void main(String[] args) {
        // ստեղծվում է առաջադրանքի պուլը
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[5000];
        double sum = 0;
        // ինիցիալիզացվում է nums զանգվածի արժեքները
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((i%2) == 0) ? i : -i;
            Sum_2 task = new Sum_2(nums, 0, nums.length);
            // մեկնարկում է ForkJoinTask տիպի առաջադրանքի կատարումը:
            // Ուշադրություն դարձրեք այն բանին, որ invoke( ) մեթոդը
            // վերադարձնում է արդյունք
            sum = fjp.invoke(task);
        }
        System.out.println("Ընդհանուր գումարը " + sum);
    }
}

