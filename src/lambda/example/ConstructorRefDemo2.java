package lambda.example;

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc5<Integer> myClassCons = MyClass2:: new;
        MyClass2<Integer> mc = myClassCons.func(100);
        System.out.println("mc օբյեկտում val փոփոխականի " +
                "արժեքը հավասար է " + mc.getVal());
    }
}

