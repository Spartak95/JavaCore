package util.example;

import java.util.Random;

public class RandDemo_2 {
    public static void main(String[] args) {
        Random num = new Random();
        int res;
        for ( int i = 1; i <= 5; i++ ) {
            res = 1 + num.nextInt( 10 );
            System.out.print(res + " ");
        }
        System.out.println();
        System.out.println(num.nextBoolean());
        System.out.println(num.nextDouble());
        System.out.println(num.nextFloat());
        System.out.println(num.nextInt());
    }
}

