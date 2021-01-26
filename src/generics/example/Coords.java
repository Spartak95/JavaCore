package generics.example;

public class Coords<T extends TwoD> {
    public T[] coords;
    public Coords(T[] coords){
       this.coords = coords;
    }
}

