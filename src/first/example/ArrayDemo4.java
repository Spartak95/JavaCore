package first.example;

public class ArrayDemo4 {
    public static void main(String[] args) {
        double[] num = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (int i = 0; i < 5; i++) {
           result = result + num[i];
        }
        System.out.println("Միջին արժեքը հավասար է " + result/5);
    }
}

