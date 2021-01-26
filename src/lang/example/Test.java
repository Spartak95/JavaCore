package lang.example;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
      Class cls = Class.forName("lang.example.Test");
      System.out.println("Class = " + cls);
      System.out.println("Class = " + cls.getName());
      System.out.println("Package = " + cls.getPackage());
      System.out.println("Module = " + cls.getModule().getName());
    }
}

