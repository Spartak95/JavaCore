package concurrency.example;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment {
    public static void main(String[] args) {
        int threshold = 1000;
        // այս փոփոխականները օգտագործվում է առաջադրանքի
        // կատարման վրա ծախսվող ժամանակի չափման համար
        long beginT, endT;
        // ստանում ենք պրոցեսսորում առկա միջուկների քանակին
        int avPr = Runtime.getRuntime().availableProcessors();
        System.out.println("Պրոցեսսորում առկա միջուկների քանակը " + avPr);
        System.out.println();
        // ստեղծվում է առաջադրանքի պուլը, որի կոնստրուկտորի
        // պարամետրի օգնությամբ սահմանվում է զուգահեռության մակարդակ
        ForkJoinPool fjp = new ForkJoinPool(1);
        double[] nums = new double[1000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }
        Transform task = new Transform(nums, 0, nums.length, threshold);
        // սկսում ենք չափել առաջադրանքի կատարման վրա ծախսվող ժամանակը
        beginT = System.nanoTime();
        // ForkJoinTask տիպի առաջադրանքի կատարման մեկնարկ
        fjp.invoke(task);
        // ավարտում ենք չափել առաջադրանքի կատարման վրա ծախսվող ժամանակը
        endT = System.nanoTime();
        System.out.println("Զուգահեռության մակարդակը 1");
        System.out.println("Հաջորդական մշակման սահմանը " + threshold);
        System.out.println("Սպառված ժամանակը " + (endT - beginT) + " նվ");
        System.out.println();
        ForkJoinPool fjp2 = new ForkJoinPool(12);
        Transform task2 = new Transform(nums, 0, nums.length, threshold);
        // սկսում ենք չափել առաջադրանքի կատարման վրա ծախսվող ժամանակը
        beginT = System.nanoTime();
        // ForkJoinTask տիպի առաջադրանքի կատարման մեկնարկ
        fjp2.invoke(task2);
        // ավարտում ենք չափել առաջադրանքի կատարման վրա ծախսվող ժամանակը
        endT = System.nanoTime();
        System.out.println("Զուգահեռության մակարդակը 12");
        System.out.println("Հաջորդական մշակման սահմանը " + threshold);
        System.out.println("Սպառված ժամանակը " + (endT - beginT) + " նվ");
    }
}

