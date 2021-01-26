package lambda.example;

import java.util.function.Function;

public class UseFunctionInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i=1; i<=n; i++){
                result = i * result;
            }
            return result;
        };
        System.out.println("3 թվի ֆակտորիալը հավասար է " + factorial.apply(3));
        System.out.println("5 թվի ֆակտորիալը հավասար է " + factorial.apply(5));
    }
}

