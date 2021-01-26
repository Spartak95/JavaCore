package Assert.example;

public class AssertDemo2 {
    private static int val = 3;
    private static int getnum(){
        return val--;
    }
    public static void main(String[] args) {
        int n = 0;
        for (int i=0; i<10; i++) {
            assert (n = getnum()) > 0;
            System.out.println("n = " + n);
        }
    }
}

