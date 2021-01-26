package exception.example;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 12 / a;
            int[] c =new int[5];
            c[6]=30;
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}

