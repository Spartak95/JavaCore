package inheritance.example.Box;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("mybox1 ծավալը հավասար է " + vol);
        System.out.println("mybox1 քաշը հավասար է " + mybox1.weight);
        vol = mybox2.volume();
        System.out.println("mybox2 ծավալը հավասար է " + vol);
        System.out.println("mybox2 քաշը հավասար է " + mybox2.weight);
    }
}

