package varArgs.example;

public class VarArgs2 {
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
    static void vaTest(String msg, int ... v){
        System.out.print("vaTest(String msg, int ... v) " + "արգումենտների քանակը " + v.length + msg);
        for (int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(", պարունակում է ",10, 20);
        vaTest(true, false, false);
    }
}

