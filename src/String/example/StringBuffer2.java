package String.example;

public class StringBuffer2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Բարի գալուստ");
        System.out.println("Երկարություն հավասար է " + str.length());
        System.out.println("Մինչև ensureCapacity "
                + "մեթոդի օգտագործելը տարողությունը  հավասար է " + str.capacity());
        str.ensureCapacity(42);
        System.out.println("ensureCapacity "
                + "մեթոդի օգտագործելուց հետո տարողությունը  հավասար է " + str.capacity());
    }
}

