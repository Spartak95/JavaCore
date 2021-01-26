package generics.example;

public class GenMethDemo {
    public static<T extends Comparable<T>, V extends  T> boolean isIn(T x, V[] y){
        for (int i=0; i<y.length; i++){
           if (x.equals(y[i])) return true;
        }
        return false;
    }
    public static void main(String[] args) {
       Integer[] nums = {1, 2, 3, 4, 5};
       if (isIn(2, nums)){
           System.out.println("2 թիվը պարունակում է nums զանգվածում");
       }
       if (!isIn(7, nums)){
           System.out.println("7 թիվը բացակայում է nums զանգվածում");
       }
       System.out.println();
       String[] strs = {"մեկ", "երկու", "երեք", "չորս", "հինգ"};
       if (isIn("երկու", strs)){
          System.out.println("երկու բառը պարունակում է strs զանգվածում");
       }
       if (!isIn("յոթ", strs)){
          System.out.println("յոթ բառը բացակայում է strs զանգվածում");
       }
     // չի կոմպիլացվի քանի որ տիպերը չեն համապատասխանում
     // if (isIn("երկու", nums)){
     //   System.out.println("երկու բառը պարունակում է strs զանգվածում");
     // }
    }
}






