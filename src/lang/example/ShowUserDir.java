package lang.example;

public class ShowUserDir {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.vm.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.vm.version"));
        System.out.println(System.getProperty("user.dir"));
    }
}

