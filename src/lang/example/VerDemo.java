package lang.example;

public class VerDemo {
    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();
        System.out.println("Տարբերակի հիմանական համարը " +
                ver.major());
        System.out.println("Տարբերակի լրացուցիչ համարը " +
                ver.minor());
        System.out.println("Համակարգային անվտանգության " +
                "արբերակի համարը " + ver.security());
    }
}

