package first.example;

public class SwitchOpDemo {
    public static void main(String[] args) {
        int mouth = 4; // Ապրիլ
        String season;
        switch (mouth){
            case 12:
            case 1:
            case 2:
            season = "ձմռան";
            break;
            case 3:
            case 4:
            case 5:
            season = "գարնան";
            break;
            case 6:
            case 7:
            case 8:
            season = "ամռան";
            break;
            case 9:
            case 10:
            case 11:
            season = "աշնան";
            break;
            default:
            season = "Այդպիսի ամիս գոյություն չունի";
        }
        System.out.println("Ապրիլը " + season + " ամիս է");
    }
}


