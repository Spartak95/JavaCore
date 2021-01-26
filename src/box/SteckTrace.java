package Box;

public class SteckTrace {

    public static void main(String[] args) {
        System.out.println("Մեթոդ main հաջող կատարվել է");
        m1();
        System.out.println("Մոթոդ main վերջացրել է իր աշխատանքը");
    }

    static void m1() {
        System.out.println("Մեթոդ m1 հաջող կատարվել է");
        m2();
    }

    static void m2() {
        System.out.println("Մեթոդ m2 հաջող կատարվել է");
    }

}

