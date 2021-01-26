package concurrency.example;

import java.util.concurrent.RecursiveAction;

public class Transform extends RecursiveAction {
    // տվյալ օրինակում սահմանային արժեքը
    // սահմանվում է կոնստրուկտորի օգնությամբ
    private int seqThreshold;
    // մշակվող զանգված
    private double[] data;
    // որոշվում է մշակվող տվյալների հատվածը
    private int start, end;
    public Transform(double[] data, int start, int end, int seqThreshold) {
        this.data = data;
        this.start = start;
        this.end = end;
        this.seqThreshold = seqThreshold;
    }
    // այս մեթոդը կատարում է զուգահեռ հաշվարկ
    @Override
    protected void compute() {
        // եթե էլեմենտների քանակը փոքր է սահմանային
        // արժեքից, ապա շարունակել կատարել հաջորդական մշակումը
       if ((end - start) < seqThreshold){
           for (int i = start; i < end; i++) {
               if ((data[i] % 2) == 0){
                   data[i] = Math.sqrt(data[i]);
               }else {
                   data[i] = Math.cbrt(data[i]);
               }
           }
       }
       // հակառակ դեպքում շարունակվում է
       // տվյալների բաժանումը ավելի փոքր մասերի
       else {
           // գտնել մեջտեղը
           int middle = (start + end) / 2;
           // մեկնարկում է նոր առաջադրանքների կատարում
           // օգտագործելով տվյալների բաժանված մասերը
           invokeAll(new Transform(data, start, middle, seqThreshold),
                       new Transform(data, middle, end, seqThreshold));
       }
    }
}

