package String.example;

public class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(" ", "Alpha",
                "Beta", "Gamma");
        System.out.println(result);
        result = String.join(", ", "Spartak", "ID#: 569",
                "E-mail: gareginyans@gmail.com");
        System.out.println(result);
    }
}

