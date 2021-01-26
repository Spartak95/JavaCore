package first.example;

public class SwitchOpDemo_3 {
    public static void main(String[] args) {
        int target = 1;
        int count = 2;
        switch (count){
            case 1:
            switch (target){
                case 1:
                System.out.println("target հավասար է մեկի");
                break;
                case 2:
                System.out.println("target հավասար է երկուսի");
                break;
                default:
                System.out.println("Այդպիսի թիվ գոյություն չունի");
            }
            break;
            case 2:
            System.out.println("count հավասար է երկուսի");
            break;
        }
    }
}

