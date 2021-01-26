package concurrency.example;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment_2 {
    public static void main(String[] args) {
        int threshold = 1000;
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[1000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }
        Transform task = new Transform(nums, 0, nums.length, threshold);
        // մեկնարկում է ForkJoinTask տիպի առաջադրանքի կատարումը
        fjp.execute(task);
        // սպասելու ժամանակ ցույց է տալիս պուլի վիճակը
        while (!task.isDone()){
            System.out.print(fjp);
        }
    }
}

