package String.example;

public class Strings {
    public static void main(String[] args) {
        String stOb1 = "Առաջին տող";
        String stOb2 = "Երկրորդ տող";
        String stOb3 = stOb1;
        System.out.println("strOb1 տողի երկարությունը " + stOb1.length());
        System.out.println("Սիմվոլը ըստ 3 ինդեքսով strOb1 տողում կլինի " + stOb1.charAt(3));

        if(stOb1.equals(stOb2)){
            System.out.println("strOb1 == strOb2");
        }
        else
            System.out.println("strOb1 =! strOb2");

        if(stOb1.equals(stOb3)){
            System.out.println("strOb1 == strOb3");
        }
        else
            System.out.println("strOb1 =! strOb3");
    }
}



