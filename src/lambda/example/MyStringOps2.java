package lambda.example;

public class MyStringOps2 {
    public String strReverse(String str){
        String result = " ";
        for (int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}

