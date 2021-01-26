package generics.example;

public class Gen3<T> extends NonGen2 {
    private T ob;
    public Gen3(T ob, int num) {
        super(num);
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
}

