package inheritance.example.privateaccess;

public class B extends A {

    public int total;

    public void sum(){
        //total = i + j; /* կառաջանա սխալ j անդամը
                          //ենթակասսում հասանելի չէ*/

    }
}

