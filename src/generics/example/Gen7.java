package generics.example;

public class Gen7<T> extends Gen6<T> {

    public Gen7(T ob) {
        super(ob);
    }

    @Override
    public T getOb() {
        System.out.print("getOb() մեթոդը Gen7 կլասսից ");
        return ob;
    }

}

