package recursion;

public class Recursion2 {
    public static void main(String[] args) {
        RecTest recTest = new RecTest(10);
        for (int i=0; i<10; i++){
            recTest.values[i] = i;
        }
        recTest.printArray(10);
    }

}

