package generics.example;

public class Gen4<T> {
    private T ob;
    public Gen4(T ob) {
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
}

