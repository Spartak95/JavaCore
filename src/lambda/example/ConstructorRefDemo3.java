package lambda.example;

public class ConstructorRefDemo3 {
    public static <R, T> R myClassFactory(MyFunc6<R, T> cons, T v){
       return cons.func(v);
    }
    public static void main(String[] args) {
       MyFunc6<MyClass3<Double>, Double> myClassCons = MyClass3::new;
       MyClass3<Double> mc = myClassFactory(myClassCons, 100.1);
       System.out.println("mc օբյեկտում val փոփոխականի " +
               "արժեքը հավասար է " + mc.getVal());
       MyFunc6<MyClass4, String> myClassCons2 = MyClass4::new;
       MyClass4 mc2 = myClassFactory(myClassCons2, "լյամբդա");
       System.out.println("mc2 օբյեկտում str փոփոխականի արժեքը " +
               "հավասար է " + mc2.getStr());
    }
}

