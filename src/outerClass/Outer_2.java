package outerClass;

public class Outer_2 {
    static int outer_x = 100;
    static void test(){
        for (int i=0; i<10; i++){
            class Inner {
                void display(){
                    System.out.println("outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
