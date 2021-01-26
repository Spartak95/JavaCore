package lang.example;

public class Elapsed {
    public static void main(String[] args) {
        long start;
        long end = 0;
        // ստանում ենք ժամանակի սկիզբը
        start = System.currentTimeMillis();
        for (long i=0; i<100_000_000L; i++){
            // ստանում ենք ժամանակի վերջը
            end = System.currentTimeMillis();
        }
        System.out.println("Կատարման ժամանակը " + (end - start));
    }
}

