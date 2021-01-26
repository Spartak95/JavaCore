package String.example;

public class SetLengthDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Բարի գալուստ Java աշխարհ");
        System.out.println("str սիմվոլային տողը պարունակում է - " + str);
        System.out.println("Սիմվոլային տողի երկարությունը հավասար է "
                + str.length());
        str.setLength(12);
        System.out.println("setLength() մեթոդից հետո str սիմվոլային " +
                "տողը պարունակում է " + str.toString());
    }
}

