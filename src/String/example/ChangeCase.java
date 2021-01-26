package String.example;

public class ChangeCase {
    public static void main(String[] args) {
        String s = "Սիմվոլային տող";
        System.out.println("Սկզբնական տողը " + s);
        System.out.println("Վերին ռեգիստրով տառերը " + s.toUpperCase());
        System.out.println("Ներքևի ռեգիստրով տառերը " + s.toLowerCase());
    }
}

