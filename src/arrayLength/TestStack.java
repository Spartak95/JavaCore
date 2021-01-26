package arrayLength;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);
        // տեղադրել թվերը ստեկում
        for (int i=0; i<5; i++){
            mystack1.push(i);
        }
        for (int i=0; i<8; i++){
            mystack2.push(i);
        }
        // դուրս հանել թվերը ստեկից
        System.out.println("mystack1 ստեկը:");
        for (int i=0; i<5; i++){
            System.out.println(mystack1.pop());
        }
        System.out.println("mystack2 ստեկը:");
        for (int i=0; i<8; i++){
            System.out.println(mystack2.pop());
        }

    }
}


