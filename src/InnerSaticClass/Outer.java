package InnerSaticClass;

public class Outer {
    static int a = 10;
    static class Nested_Demo {
         void my_method() {
             System.out.println("Սա ներդրված ստատիկ կլասս է");
             System.out.println("a = " + a);
         }
    }
}

