package inheritance.example.Box;

public class RefDemo {
    public static void main(String[] args) {

        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box pianbox = new Box();
        double vol;
        vol = weightbox.volume();
        System.out.println("weightbox ծավալը հավասար է " + vol);
        System.out.println("weight քաշը հավասար է " + weightbox.weight);
        // Box տիպի փոփոխականը վերագրում են BoxWeight օբյեկտի հղումը
        pianbox = weightbox;
        vol = pianbox.volume();
        System.out.println("pianbox ծավալը հավասար է " + vol);
        // կառաջանա սխալ քանի որ Box կլասսում, որոշված չէ weight փոփոխականը
        //System.out.println("weight քաշը հավասար է " + pianbox.weight);

    }
}

