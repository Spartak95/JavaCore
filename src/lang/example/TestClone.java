package lang.example;

public class TestClone implements Cloneable{
    public int a;
    public double b;
    public TestClone cloneTest(){
        try {
        // clone() մեթոդը կանչվում է Object կլասսից
            return (TestClone)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Կլոնավորումը անհնար է");
            return this;
        }
    }
}

