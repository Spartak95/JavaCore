package enums.example;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        Apple.RedDel.compareTo(Apple.GoldenDel); // 1
         Apple.RedDel.compareTo(Apple.RedDel); // 0
         Apple.RedDel.compareTo(Apple.Cortland); // 2
        System.out.println(Apple.RedDel.compareTo(Apple.GoldenDel));
        System.out.println(Apple.RedDel.compareTo(Apple.RedDel));
        System.out.println(Apple.RedDel.compareTo(Apple.Cortland));
//       System.out.println("Winesap տեսակի խնձորը արժի " +
//               Apple.Winesap.getPrice() + " դրամ");
//           for(Apple a : Apple.values()){
//          System.out.println(a + " տեսակի խնձորը արժի " +
//                   a.getPrice() +" դրամ");
//       }
    }
}

