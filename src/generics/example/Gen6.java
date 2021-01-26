package generics.example;

public class Gen6<T> {
    public T ob;
    public Gen6(T ob) {
        this.ob = ob;
    }
    public T getOb() {
        System.out.print("getOb() մեթոդը Gen կլասսից ");
        return ob;
    }
}

