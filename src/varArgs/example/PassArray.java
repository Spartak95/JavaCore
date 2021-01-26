package varArgs.example;

public class PassArray {
    static void vaTest(int ... v ){
        System.out.print("Արգումենտների քանակը " + v.length + ", զանգվածը պարունակում է ");
        for(int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      vaTest(10); // մի հատ արգումենտ
      vaTest(); // առանց արգումենտ
      vaTest(1, 2, 3); // երեք հատ արգումենտ
      vaTest(6, 4); // երկու հատ արգումենտ
    }
}

