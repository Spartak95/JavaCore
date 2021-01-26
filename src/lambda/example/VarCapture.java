package lambda.example;

public class VarCapture {
    public static void main(String[] args) {
        // լոքալ փոփոխական, որին կարող են գրավել
        int num = 10;
        MyFunc myLambda = (n) -> {
            //this.a = 12;
            int v = num + n;
            return v;
        };
        System.out.println(myLambda.func(10));
        // կառաջանա սխալ, քանի որ խախտվում է
        // փոփոխականի արժեքի վերջնական լինելը
        // num = 23;
    }
}

