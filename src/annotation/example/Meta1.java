package annotation.example;

import java.lang.reflect.Method;

public class Meta1 {
    @MyAnno(str = "Երկու պարամետր", val = 100)
    public static void myMeth(String str, int val){
        Meta1 ob = new Meta1();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + ", " + anno.val());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        myMeth("Տեքստ", 100);
    }
}

