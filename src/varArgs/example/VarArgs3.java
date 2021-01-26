package varArgs.example;

public class VarArgs3 {
    static  void  vaTest(int ... v){
        System.out.print("vaTest(int ... v) " + "արգումենտների քանակը " + v.length + ", պարունակում է ");
        for (int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static  void  vaTest(boolean ... v){
        System.out.print("vaTest(boolean ... v) " + "արգումենտների քանակը " + v.length + ", պարունակում է ");
        for (boolean x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest(1, 2, 3); // ճիշտ է
        //vaTest(); // կառաջանա սխալ
        vaTest(true, false, false); // ճիշտ է
    }
}

