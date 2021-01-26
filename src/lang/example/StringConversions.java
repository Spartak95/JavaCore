package lang.example;

public class StringConversions {
    public static void main(String[] args) {
        int num = 19648;
        System.out.println(num + " թիվը երկուական համակարգով կլինի "
                + Integer.toBinaryString(num));
        System.out.println(num + " թիվը ութական համակարգով կլինի " +
                Integer.toOctalString(num));
        System.out.println(num + " թիվը տանսվեցական համակարգով կլինի "
                + Integer.toHexString(num));
    }
}

