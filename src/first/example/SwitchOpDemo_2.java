package first.example;

public class SwitchOpDemo_2 {
    public static void main(String[] args) {
        String str = "երկու";
        switch (str){
            case "մեկ":
                System.out.println("մեկ");
                break;
            case "երկու":
                System.out.println("երկու");
                break;
            case "երեք":
                System.out.println("երեք");
                break;
            default:
                str = "Այդպիսի թիվ գոյություն չունի";
        }
    }
}

