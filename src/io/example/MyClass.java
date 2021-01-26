package io.example;

import java.io.Serializable;

public class MyClass implements Serializable {
    private String s;
    private int i;
    private double d;
    transient byte b = 12;
    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }
    @Override
    public String toString() {
        return "s=" + s + ", i=" + i + ", d=" + d + ", b=" + b;
    }
}

