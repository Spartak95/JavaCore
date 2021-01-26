package concurrency.example;

import java.util.concurrent.RecursiveTask;

// RecursiveTask կլասսը օգտագործվում է double տիպի
// զանգվածների էլեմենտների արժեքների գումարը հաշվելու համար
public class Sum_2 extends RecursiveTask<Double> {
    // սահմանային արժեքը
    private Final int seqThresHold = 500;
    // մշակվող զանգվածը
    private double[] data;
    // որոշվում է զանգվածի էլեմենտների մշակման սահմանը
    private int start, end;
    public Sum_2(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }
    @Override
    protected Double compute() {
        double sum = 0;
        // եթե էլեմենտների քանակը փոքր է սահմանային
        // արժեքից, ապա շարունակել կատարել հաջորդական մշակումը
        if ((end - start) < seqThresHold){
            // հաշվում է double տիպի զանգվածների էլեմենտների արժեքների գումարը
            for (int i = start; i < end; i++) {
               sum += data[i];
            }
        }
        // հակառակ դեպքում շարունակվում է
        // տվյալների բաժանումը ավելի փոքր մասերի
        else {
            // գտնել մեջտեղը
            int middle = (start + end) / 2;
            // առաջադրանքը բաժանվում է ենթաառաջադրանքների
            Sum_2 subTaskA = new Sum_2(data, start, middle);
            Sum_2 subTaskB = new Sum_2(data, middle, end);
            // մեկնարկում է ենթառաջադրանքների կատարումը
            subTaskA.fork();
            subTaskB.fork();
            // սպասում է ենթաառաջադրանքի ավարտին և ստանում
            // ենք ամեն ենթաառաջադրանքի կատարման արդյունքը
            sum = subTaskA.join() + subTaskB.join();
        }
        // վերադարձնում է վերջնական գումարը
        return sum;
    }
}

// invokeAll(subTaskA, subTaskB);
// sum = subTaskA.join() + subTaskB.join();

// subTaskA.fork();
// sum = subTaskA.join() + subTask.invoke
