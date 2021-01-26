package first.example;

public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello\nWorld";
        String s2 = "Hello\bWorld";
        String s3 = "Hello\rWorld";
        String s4 = "Hello\tWorld";
        String s5 = "Hello\fWorld";
        String s6 = "Hello\'World";
        String s7 = "Hello\"World";
        String s8 = "Hello\\World";
        String s9 = "Hello\\\\ World";
        System.out.println("\\n -> " + s);
        System.out.println("\\b -> " + s2);
        System.out.println("\\r -> " + s3);
        System.out.println("\\t -> " + s4);
        System.out.println("\\f -> " + s5);
        System.out.println("\' -> " + s6);
        System.out.println("\" -> " + s7);
        System.out.println("\\ -> " + s8);
        System.out.println("\\\\ -> " + s9);
    }
}

