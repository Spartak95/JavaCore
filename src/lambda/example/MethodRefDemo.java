package lambda.example;

public class MethodRefDemo {
    public static String stringOp(StringFunc sf, String s){
       return sf.func(s);
    }
    public static void main(String[] args) {
        String instr = "Լյամբդա արտահայտությունը բարձրացնում " +
                "է Java-ի էֆֆեկտիվությունը";
        String outStr;
        outStr = stringOp(MyStringOps :: strReverse, instr);
        // համարժեք է մեթոդի վրա հղմանը
        //(n) -> {
        //   String result = " ";
        //     for (int i=str.length()-1; i>=0; i--){
        //     result += str.charAt(i);
        //   }
        //    return result;
        // }
        System.out.println("Սկզբնական տողը - " + instr);
        System.out.println("Վերափոխված տողը - " + outStr);
    }
}

