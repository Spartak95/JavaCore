package Box;

public class BoxDemo {

    public static void main(String[] args) {
     // հայտարարել, հատակցնել հիշողություն և ինիցիալիզացնել
     // Box տիպի օբյեկտ
     Box mybox1 = new Box(10, 20, 15);
     Box mybox2 = new Box(3, 6, 9);
     Box mybox3 = new Box(3, 6);
     double vol;
     // ստանաք առաջին խորանարդի ծավալը
     vol = mybox1.volume();
        System.out.println("Ծավալը հավասար է " + vol);
        // ստանաք երկրորդ խորանարդի ծավալը
     vol = mybox2.volume();
     System.out.println("Ծավալը հավասար է " + vol);
    }

}


