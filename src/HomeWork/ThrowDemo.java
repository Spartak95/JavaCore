package HomeWork;

public class ThrowDemo {
    public static void throwOne(){
        System.out.println("throwOne() մեթոդում");
        throw new IndexOutOfBoundsException();
    }
    public static void main(String[] args) {
        throwOne();
    }
}
