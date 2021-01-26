package exception.example;

public class SuberSubCatch {
    public static void main(String[] args) {
        try {
           int a = 0;
           int b = 12/0;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException բացառությունը չի կատարվի");
        }catch (Exception e){
            System.out.println("Կբռնի միայն ընդհանուր Exception կլասսը");
        }
    }
}

