package concurrency.example;

import java.util.concurrent.*;

public class CallableDemo_2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;
        System.out.println("Մեկնարկ");
        f = es.submit(new Sum(10));
        f2 = es.submit(new Hypot(3, 4));
        f3 = es.submit(new Factorial(5));
        try {
            System.out.println(f.get(1000, TimeUnit.MILLISECONDS));
            System.out.println(f2.get(1000, TimeUnit.MILLISECONDS));
            System.out.println(f3.get(1000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        es.shutdown();
        System.out.println("Ավարտվել է");
    }
}

