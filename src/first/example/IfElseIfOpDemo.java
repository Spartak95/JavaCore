package first.example;

public class IfElseIfOpDemo {
    public static void main(String[] args) {
        int mouth = 4; // Ապրիլ
        String season;
        if (mouth == 12 || mouth == 1 || mouth == 2){
            season = "ձմռան";
        } else if (mouth == 3 || mouth == 4 || mouth == 5){
            season = "գարնան";
        } else if (mouth == 6 || mouth == 7 || mouth == 8){
            season = "ամռան";
        } else if (mouth == 9 || mouth == 10 || mouth == 11){
            season = "աշնան";
        } else {
            season = "Այդպիսի ամիս գոյություն չունի";
        }
        System.out.println("Ապրիլը " + season + " ամիս է");
    }
}

