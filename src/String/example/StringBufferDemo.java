package String.example;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("բուֆերը " + sb);
        System.out.println("երկարությունը " + sb.length());
        System.out.println("տարողունակությունը " + sb.capacity());
    }
}

