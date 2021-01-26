package generics.example;

public interface MimMax<T extends Comparable<T>> {
    T min();
    T max();
}

