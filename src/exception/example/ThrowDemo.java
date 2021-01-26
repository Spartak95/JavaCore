package exception.example;

public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("Ցուցադրում");
        }catch (NullPointerException e){
            System.out.println("Բացառությունը բռնվում է " +
                    "demoproc() մեթոդի մարմնում");
            throw e;
        }
    }
    public static void main(String[] args) {
      try{
        demoproc();
      }catch (NullPointerException e){
          System.out.println("Բացառության կրկնակի բռնում " + e);
      }
    }
}

