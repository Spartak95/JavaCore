package exception.example;

public class ChainExcDemo {
    public static void demoproc(){
        // ստեղծվում է բացառություն
        NullPointerException e = new NullPointerException("վերին մակարդակն է");
        // ավելացվում է բացառության պատճառը
        e.initCause(new ArithmeticException("պատճառն է"));
        throw e;
    }
    public static void main(String[] args) {
       try{
         demoproc();
       }catch (NullPointerException e){
           System.out.println("Բռնված բացառությունը " + e);
           // դուրս է բերում այն բացառությունը, որը հանդիսացել էր
           // վերին մակարդակի բացաառության առաջացման պատճառը
           System.out.println("Բացառության առաջացման " + e.getCause());
       }
    }
}

