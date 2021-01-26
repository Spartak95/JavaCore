package lambda.example;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (int n) -> (n % 2) == 0;
        if (isEven.test(10)){
            System.out.println("Առանց մնացորդի է");
        }if (!isEven.test(9)){
            System.out.println("Մնացորդով է");
        }
        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)){
            System.out.println("Մեկը մեծ է զրոյից");
        }if (!isNonNeg.test(-1)){
            System.out.println("Մինուս մեկը փոքր է զրոյից");
        }
    }
}

