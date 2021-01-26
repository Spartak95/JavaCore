package Interface.example;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
        // տեղադրել թվերը ստեկում
        for (int i=0; i<12; i++){
            mystack1.push(i);
        }
        for (int i = 0; i<20; i++){
            mystack2.push(i);
        }
        // դուրս հանել թվերը ստեկից
        System.out.println("mystack1 ստեկում");
        for (int i=0; i<12; i++){
            System.out.println(mystack1.pop());
        }
        System.out.println("mystack2 ստեկում");
        for (int i=0; i<20; i++){
            System.out.println(mystack2.pop());
        }

    }
}

