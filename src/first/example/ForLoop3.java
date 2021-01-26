package first.example;

public class ForLoop3 {
    public static void main(String[] args) {
        int num = 14;
        boolean isPrime;
        if (num < 2) isPrime = false;
        else isPrime = true;
        for (int i = 2; i <= num/i; i++) {
            if ((num % i) == 0) isPrime = false;
        }
        if (isPrime) System.out.println("Սովորական թիվ");
        else System.out.println("Ոչ սովորական թիվ");
    }
}

