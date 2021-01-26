package pass.Object;

public class OverloadCons {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box(10,20,15);
        Box mybox3 = new Box(7);
        Box myclone = new Box(mybox2);
        double vol;
        vol = mybox1.volume();
        System.out.println("mybox1 խորանարդի ծավալը հավասար է " + vol);
        vol = mybox2.volume();
        System.out.println("mybox2 խորանարդի ծավալը հավասար է " + vol);
        vol = mybox3.volume();
        System.out.println("mybox3 խորանարդի ծավալը հավասար է " + vol);
        vol = myclone.volume();
        System.out.println("myclone խորանարդի ծավալը հավասար է " + vol);
    }

}

