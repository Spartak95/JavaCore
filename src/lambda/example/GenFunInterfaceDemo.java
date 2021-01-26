package lambda.example;

public class GenFunInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = " ";
            int i;
            for (i = str.length()-1; i>=0; i--){
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Լյամբդա բառի հակառակ գրելաձևը " + reverse.func("Լյամբդա"));
        SomeFunc<Integer> factorial = (n) -> {
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

