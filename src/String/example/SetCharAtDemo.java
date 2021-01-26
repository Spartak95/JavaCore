package String.example;

public class SetCharAtDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("sb փոփոխականի արժեքը մինչև " +
                "փոփոխելը հավասար է " + sb);
        System.out.println("1 ինդեքսին համապատասխանում է "
                + sb.charAt(1) + " արժեքը");
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("sb փոփոխականի արժեքը փոփոխելուց " +
                "հետո հավասար է " + sb);
        System.out.println("1 ինդեքսին համապատասխանում է "
                + sb.charAt(1) + " արժեքը");
    }
}

