package lambda.example;

public class MyArrayOps {
    public static <T> int countMatching(T[] vals, T v){
        int count = 0;
        for (int i=0; i<vals.length; i++){
           if (vals[i] == v){
               count++;
           }
        }
        return count;
    }
}

