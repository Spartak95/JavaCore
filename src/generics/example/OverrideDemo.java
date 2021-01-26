package generics.example;

public class OverrideDemo {
    public static void main(String[] args) {
       Gen6<Integer> iOb = new Gen6<Integer>(88);
       Gen7<Integer> iOb2 = new Gen7<Integer>(99);
       Gen7<String> strOb2 = new Gen7<String>("թեքստային ընդհանրացում");
       System.out.println(iOb.getOb());
       System.out.println(iOb2.getOb());
       System.out.println(strOb2.getOb());
    }
}

