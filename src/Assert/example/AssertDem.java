package Assert.example;

public class AssertDem {
    private static int val = 3;
    private static int getnum(){
        return val--;
    }
    public static void main(String[] args) {
        int n;
        for (int i=0; i<10; i++) {
            n = getnum();
            assert n > 0: "n is minus";
            System.out.println("n = " + n);
        }
    }
}

