package Instanceof.example;

public class InstanceOF {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (new A() instanceof A) {
            System.out.println("a-ն պատկանում է A տիպին");
        }
        if (b instanceof B) {
            System.out.println("b-ն պատկանում է B տիպին");
        }
        if (c instanceof C) {
            System.out.println("c-ն պատկանում է C տիպին");
        }
        if (d instanceof D) {
            System.out.println("d-ն պատկանում է D տիպին");
        }
        if (c instanceof A) {
            System.out.println("c-ն պատկանում է C տիպին");
        }
        if (d instanceof A) {
            System.out.println("d-ն պատկանում է A տիպին");
        }
        if (a instanceof Object) {
            System.out.println("a-ն պատկանում է Object տիպին");
        }
        if (b instanceof Object) {
            System.out.println("b-ն պատկանում է Object տիպին");
        }
        if (c instanceof Object) {
            System.out.println("c-ն պատկանում է Object տիպին");
        }
        if (d instanceof Object) {
            System.out.println("d-ն պատկանում է Object տիպին");
        }
    }
}

