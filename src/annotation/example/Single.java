package annotation.example;

import java.lang.reflect.Method;

public class Single {
    @MySingle(100)
    public static void myMeth(){
       Single ob = new Single();
       try {
           Method c = ob.getClass().getMethod("myMeth");
           MySingle anno = c.getAnnotation(MySingle.class);
           System.out.println(anno.value());
       }catch (NoSuchMethodException e){
           System.out.println();
       }
    }
    public static void main(String[] args) {
       myMeth();
    }
}
