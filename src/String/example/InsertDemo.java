package String.example;

public class InsertDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Բարի գալուստ Java");
        sb.insert(17, " աշխարհ");
        System.out.println(sb);
    }
}

