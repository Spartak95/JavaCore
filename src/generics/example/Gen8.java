package generics.example;

public class Gen8<T extends Number> {
   private T[] vals;
    public Gen8(T[] vals) {
        this.vals = vals;
    }
}

