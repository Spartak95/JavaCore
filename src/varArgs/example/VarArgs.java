package varArgs.example;

public class VarArgs {
    static void vaTest(String msg, int ... v){
        System.out.print(msg + v.length + " պարունակում է ");
        for (int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Մեկ պարամետրը փոփոխականի երկարությամբ ", 10 );
        vaTest("Երեք պարամետրը փոփոխականի երկարությամբ ", 1, 2, 3 );
        vaTest("Առանց պարամետրը փոփոխականի երկարությամբ ");
    }
}

