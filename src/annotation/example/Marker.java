package annotation.example;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth(){
       Marker ob = new Marker();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class)){
                System.out.println("MyMarker մարկերային աննոտացիան ներկա է");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Մեթոդը չի հայտնաբերվել");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}

