package exception.example;

public class ThrowDemo_2 {
    public static void throwOne(){
        System.out.println("throwOne() մեթոդում");
        throw new IndexOutOfBoundsException();
    }
    public static void main(String[] args) {
        throwOne();
    }
}

