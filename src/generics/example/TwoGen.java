package generics.example;

public class TwoGen<T, V> {
    private T ob1;
    private V ob2;
    public TwoGen(T ob1, V ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    public void showTypes(){
        System.out.println("T տիպը " + ob1.getClass().getName());
        System.out.println("V տիպը " + ob2.getClass().getName());
    }
    public T getOb1(){
        return ob1;
    }
    public V getOb2(){
        return ob2;
    }
}

