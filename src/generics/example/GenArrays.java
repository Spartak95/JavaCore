package generics.example;

public class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gen8<Integer> iOb = new Gen8<Integer>(n);
      //Gen8<Integer> gens[] = new Gen8<Integer>[10]; չի թույլատրվում
        Gen8<?>[] gens = new Gen8<?>[10]; // թույլատրվում է
    }
}

