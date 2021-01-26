package generics.example;

public class MyClass<T extends Comparable<T>> implements MimMax<T>{
    private T[] vals;
    public MyClass(T[] vals) {
        this.vals = vals;
    }
    // վերադարձնում է մինիմալ արժեքը vals զանգվածից
    @Override
    public T min() {
        T v = vals[0];
        for (int i=1; i<vals.length; i++){
            if (vals[i].compareTo(v) < 0){
                v = vals[i];
            }
        }
        return v;
    }
    // վերադարձնում է մաքսիմալ արժեքը vals զանգվածից
    @Override
    public T max() {
        T v = vals[0];
        for (int i=1; i<vals.length; i++){
            if (vals[i].compareTo(v) > 0){
                v = vals[i];
            }
        }
        return v;
    }
}


