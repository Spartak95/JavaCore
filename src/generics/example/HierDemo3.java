package generics.example;

public class HierDemo3 {
    public static void main(String[] args) {
       Gen4<Integer> iOb = new Gen4<Integer>(88);
       Gen5<Integer> iOb2 = new Gen5<Integer>(99);
       Gen5<String> strOb2 = new Gen5<String>("Ընդհանրացված տիպ");
       if (iOb2 instanceof Gen5<?>){
           System.out.println("iOb2 օբյեկտը պատկանում է Gen5 տիպին");
       }if (iOb2 instanceof Gen4<?>){
           System.out.println("iOb2 օբյեկտը պատկանում է Gen4 տիպին");
       }
       System.out.println();
       if (strOb2 instanceof Gen5<?>){
           System.out.println("strOb2 օբյեկտը պատկանում է Gen5 տիպին");
       }if (strOb2 instanceof Gen4<?>){
           System.out.println("strOb2 օբյեկտը պատկանում է Gen4 տիպին");
       }
       System.out.println();
       // չի կատարվի, քանի որ iOb օբյեկտը չի պատկանում Gen5 տիպի օբյեկտին
       if (iOb instanceof Gen5<?>){
            System.out.println("iOb օբյեկտը պատկանում է Gen5 տիպին");
       }if (iOb instanceof Gen4<?>){
            System.out.println("strOb2 օբյեկտը պատկանում է Gen4 տիպին");
       }
       // չի կոմպիլացվի, քանի որ ընդհանրացման տիպի մասին տեղեկությունները
       // բացակայում է ծրագրի կատարման պահին
       // if (iOb2 instanceof Gen5<Integer>){
       // System.out.println("iOb2 օբյեկտը պատկանում է Gen5 տիպին");
       // }
    }
}

