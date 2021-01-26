package Static.Example;

public class UserStatic {
    public static void main(String[] args) {
        meth(42);
    }
    static int a = 3;
    static int b;
    static void meth(int x){
       System.out.println("x = " + x);
       System.out.println("a = " + a);
       System.out.println("b = " + b);
    }
    static {
       System.out.println("Ստատիկ բլոկը ինիցիալիզացված է");
       b = a * 3;
    }
}

