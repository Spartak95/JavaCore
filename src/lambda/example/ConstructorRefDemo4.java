package lambda.example;

public class ConstructorRefDemo4 {
    public static void main(String[] args) {
        MyArrayCreator<MyClass5[]> ma = MyClass5[]::new;
        MyClass5[] a = ma.func(2); // new MyClass5[2];
        a[0] = new MyClass5(2);
        a[1] = new MyClass5(3);
        System.out.println(a[0].getVal());
        System.out.println(a[1].getVal());
    }
}

