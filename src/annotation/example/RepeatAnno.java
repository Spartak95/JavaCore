package annotation.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
    @MyAnno2(str = "Առաջին աննոտացիա", val = 50)
    @MyAnno2(str = "Երկրորդ աննոտացիա", val = 100)
    public static void myMeth(){
        RepeatAnno ob = new RepeatAnno();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            //Annotation annot = m.getAnnotation(MyRepeatedAnnos.class);
            //MyRepeatedAnnos annot = m.getAnnotation(MyRepeatedAnnos.class);
            Annotation[] anno =  m.getAnnotationsByType(MyAnno2.class);
            Annotation[] anno2 =  m.getAnnotations();
            // նույն է -> MyAnno2[] anno =  m.getAnnotationsByType(MyAnno2.class);
            for (Annotation a : anno2){
               System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}

