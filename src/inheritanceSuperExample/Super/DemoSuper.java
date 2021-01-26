package inheritanceSuperExample.Super;

import inheritanceSuperExample.Box;
import inheritanceSuperExample.BoxWeight;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mycube);
        Box box = new Box();
        double vol;
        vol = mybox1.volume();
        System.out.println("mybox1 ծավալը հավասար է " + vol);
        System.out.println("mybox1 քաշը հավասար է " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("mybox2 ծավալը հավասար է " + vol);
        System.out.println("mybox2 քաշը հավասար է " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("mybox3 ծավալը հավասար է " + vol);
        System.out.println("mybox3 քաշը հավասար է " + mybox3.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("mycube ծավալը հավասար է " + vol);
        System.out.println("mycube քաշը հավասար է " + mycube.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("myclone ծավալը հավասար է " + vol);
        System.out.println("myclone քաշը հավասար է " + myclone.weight);
        System.out.println();

    }
}


