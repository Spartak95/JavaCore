package inheritance.example;

public class B extends A {
    public int k;
    public void showk(){
        System.out.println("k: " + k);
    }
    public void sum(){
        System.out.println("i + j + k = " + (i + j + k));
    }
}

