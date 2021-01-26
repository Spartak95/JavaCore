package util.example;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        System.out.println("Առաջին կոնստրուկտորի օգտագործում");
        StringTokenizer st1 =
                new StringTokenizer("Java : Code : String");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        System.out.println("Երկրորդ կոնստրուկտորի օգտագործում");
        StringTokenizer st2 =
                new StringTokenizer("Java : Code : String", " :");
        System.out.println(st2.countTokens());
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
        System.out.println(st2.countTokens());
        System.out.println("Երրորդ կոնստրուկտորի օգտագործում");
        StringTokenizer st3 =
                new StringTokenizer("Java : Code : String", " :",  true);
        while (st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }
    }
}

