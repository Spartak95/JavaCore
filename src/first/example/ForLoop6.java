package first.example;

public class ForLoop6 {
    public static void main(String[] args) {
        int i = 0;
        boolean done = false;
        for (; !done; ){
            System.out.println("i = " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}

