package lambda.example;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d)  -> (n % d) == 0;
        if (isFactor.test(10, 2)){
            System.out.println("Առանց մնացորդի");
        }if (isFactor.test(10, 3)){
            System.out.println("Մնացորդով");
        }
    }
}

