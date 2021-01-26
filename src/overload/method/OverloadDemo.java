package overload.method;

public class OverloadDemo {
    void test(){
        System.out.println("Պարամետրը բացակայում է");
    }
    void test(int a, int b){
        System.out.println("a և b: " + a + " " + b);
    }
    void test(double a){
        System.out.println("test(double) a: պարամետրի վերափոխումը " + a);
    }
}

