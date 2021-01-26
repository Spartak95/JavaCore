package inheritance.example.Static;

public class StaticDemo {
    public static void main(String[] args) {
        IFDemo ob = new IFDemo();
        System.out.println("ob.getNumber(): " + ob.getNumber());
        System.out.println("ob.getString(): " + ob.getString());
        System.out.println("MyIF.getDefaultNumber(): " + MyIF.getDefaultNumber());
    }
}

