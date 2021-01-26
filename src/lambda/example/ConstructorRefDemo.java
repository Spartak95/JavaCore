package lambda.example;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc4 myClassCons = MyClass::new;
        MyClass mc = myClassCons.func(100);
        System.out.println("mc օբյեկտում val փոփոխականի " +
                "արժեքը հավասար է " + mc.getVal());
    }
}

