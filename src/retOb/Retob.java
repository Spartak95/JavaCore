package retOb;

public class Retob {

    public static void main(String[] args) {
       Test ob1 = new Test(2);
       Test ob2;
       ob2 = ob1.incrByTen();
       System.out.println("ob1.a: " + ob1.a);
       System.out.println("ob2.a: " + ob2.a);
       ob2 = ob2.incrByTen();
       System.out.println("ob2.a արժեքի երկրորդ մեծացումից հետո " + ob2.a);
    }

}
