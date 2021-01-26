package exception.example;

public class ExceptionDemo {
    public static void compute(int a) throws MyException{
        System.out.println("Կանչվել է compute մեթոդը(" + a + ")");
        if (a > 10){
            throw new MyException(a);
        }
        System.out.println("Նորմալ ավարտում");
    }
    public static void main(String[] args) {
      try {
         compute(1);
         compute(20);
      }catch (MyException e){
          System.out.println("Բռնվել է բացառությունը " + e);
      }
    }
}


