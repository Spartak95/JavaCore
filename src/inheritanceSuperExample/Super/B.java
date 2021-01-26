package inheritanceSuperExample.Super;

public class B extends A {
    public int i;
    public B(int a, int b){
        super.i = a;
        i = b;
    }
    public void show(){
        System.out.println("Սուպերի կլասսի i անդամը " + super.i);
        System.out.println("Ենթակլասսի i անդամը " + i);
    }
}

