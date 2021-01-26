package annotation.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What2(description = "Կլասսի տեքստային աննոտացիան")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {
    @What2(description = "Մեթոդի տեքստային աննոտացիան")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth(){
       Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("Բոլոր աննոտացիաները Meta2 կլասսի համար");
            for (Annotation a : annos){
                System.out.println(a);
            }
            System.out.println();
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("Բոլոր աննոտացիաները myMeth() մեթոդի համար");
            for (Annotation a : annos){
                System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Մեթոդը չի հայտնաբերվել");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}


