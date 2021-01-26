package enums.example;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("ap փոփոխականի արժեքը " + ap);
        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel){
            System.out.println("ap փոփոխականը պարունակում " +
                    "է GoldenDel արժեքը");
        }
        switch (ap){
            case Jonathan:
                System.out.println("Jonathan տեսակը կարմիր է");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious տեսակը դեղին է");
                break;
            case Winesap:
                System.out.println("Winesap տեսակը կարմիր է");
                break;
            case Cortland:
                System.out.println("Cortland տեսակը կարմիր է");
                break;
            case RedDel:
                System.out.println("Red Delicious տեսակը կարմիր է");
                break;
        }
    }
}


