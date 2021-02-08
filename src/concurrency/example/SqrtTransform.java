package concurrency.example;

import java.util.concurrent.RecursiveAction;

public class SqrtTransform extends RecursiveAction {
    // տվյալ օրինակում սահմանային արժեքը
    // կամայական սահմանվում է 1000
    private final int seqThreshold = 1000;
    // մշակվող զանգվածը
    private double[] data;
    // որոշվում է մշակվող տվյալների հատվածը
    private int start, end;
    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }
    // այս մեթոդը կատարում է զուգահեռ հաշվարկ
    @Override
    protected void compute() {
        // եթե էլեմենտների քանակը փոքր է սահմանային
        // արժեքից, ապա շարունակել կատարել հաջորդական մշակումը
       if ((end - start) < seqThreshold){
           // ամեն արժեք վերափոխում է, որպես զանգվածի էլեմենտ
           for (int i = start; i < end; i++) {
               data[i] = Math.sqrt(data[i]);
           }
       }
       // հակառակ դեպքում շարունակվում է
       // տվյալների բաժանումը ավելի փոքր մասերի
       else {
           // գտնել մեջտեղը
           int middle = (start + end) / 2;
           // մեկնարկում է նոր առաջադրանքների կատարում
           // օգտագործելով տվյալների բաժանված մասերը
           invokeAll(new SqrtTransform(data, start, middle),
                   new SqrtTransform(data, middle, end));
       }
    }
}

