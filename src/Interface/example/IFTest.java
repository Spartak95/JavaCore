package Interface.example;

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        // տեղադրել թվերը ստեկում
        for (int i=0; i<5; i++){
            mystack1.push(i);
        }
        for (int i = 0; i<8; i++){
            mystack2.push(i);
        }
        // դուրս հանել թվերը ստեկից
        System.out.println("mystack1 ստեկում");
        for (int i=0; i<5; i++){
            System.out.println(mystack1.pop());
        }
        System.out.println("mystack2 ստեկում");
        for (int i=0; i<8; i++){
            System.out.println(mystack2.pop());
        }

    }
}

