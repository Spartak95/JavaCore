package lambda.example;

public class MethodRefDemo2 {
    public static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
       String inStr = "Լյամբդա արտահայտությունը բարձրացնում" +
               " է Java-ի էֆֆեկտիվությունը";
       MyStringOps2 strOps = new MyStringOps2();
       String outStr = stringOp(strOps :: strReverse, inStr);
       System.out.println("Սկզբնական տողը - " + inStr);
       System.out.println("Վերափոխված տողը - " + outStr);
    }
}

