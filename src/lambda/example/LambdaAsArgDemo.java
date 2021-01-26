package lambda.example;

public class LambdaAsArgDemo {
    public static String stringOp(StringFunc sf, String s){
         return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Լյամբդա արտահայտությունը " +
                "բարձրացնում է Java-ի էֆֆեկտիվությունը";
        String outStr;
        System.out.println("Սա սկզբնական տողն է " + inStr);
        outStr = stringOp((str) -> str.toUpperCase(), inStr);

        System.out.println("Սկզբնական տողը գրված է մեծատառով " + outStr);
        outStr = stringOp((str) -> {
           String result = " ";
           for (int i=0; i<str.length(); i++){
               if (str.charAt(i) != ' '){
                   result += str.charAt(i);
               }
           }
           return result;
        }, inStr);
        System.out.println("Սկզբնական տողը առանձ պրոբելի " + outStr);
        outStr = stringOp((str) -> {
           String result = " ";
           for (int i=str.length()-1; i>=0; i--){
               result += str.charAt(i);
           }
           return result;
        }, inStr);
        System.out.println("Սկզբնական տողի հակառակ գրելաձևը " + outStr);
    }
}


