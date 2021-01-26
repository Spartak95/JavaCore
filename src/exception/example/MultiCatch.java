package exception.example;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] vals = {1, 2 , 3 , 4};
        try{
            int result = a / b;
         // vals[10] = 12;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Բացառությունը բռնված է " + e);

        }
    }
}

