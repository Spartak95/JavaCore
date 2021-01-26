package String.example;

public class IndexOfDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Now is the time for all good men to " +
                "come to the aid of their country");
        System.out.println(sb);
        System.out.println("indexOf(t) = " +
                sb.indexOf("t"));
        System.out.println("lastIndexOf(t) = "
                + sb.lastIndexOf("t"));
        System.out.println("indexOf(the) = " +
                sb.indexOf("the"));
        System.out.println("lastIndexOf(the) = " +
                sb.lastIndexOf("the"));
        System.out.println("indexOf(t, 10) = " +
                sb.indexOf("t", 10));
        System.out.println("lastIndexOf(t, 60) = "
                + sb.lastIndexOf("t", 60));
        System.out.println("indexOf(the, 10) = " +
                sb.indexOf("the", 10));
        System.out.println("lastIndexOf(the, 60) = "
                + sb.lastIndexOf("the", 60));
    }
}

