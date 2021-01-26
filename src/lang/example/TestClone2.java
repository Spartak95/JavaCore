package lang.example;

public class TestClone2 implements Cloneable {
    public int a;
    public double b;
    public Object clone(){
        try {
        // clone() մեթոդը կանչվում է Object կլասսից
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Կլոնավորումը անհնար է");
            return this;
        }
    }
}

