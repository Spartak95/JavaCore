package lambda.example;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i=1; i<=n; i++){
               result = i * result;
            }
            return result;
        };
        System.out.println("3 թվի ֆաքտորիալը հավասար է " + factorial.func(3));
        System.out.println("5 թվի ֆաքտորիալը հավասար է " + factorial.func(5));
    }
}

