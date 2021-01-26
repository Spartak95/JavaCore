package reflection.example;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo2 {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        // Class<?> c = BMW.class;
        // այս երկու տողերը համարժեք են
        try {
            Class<?> c = bmw.getClass();
            System.out.println("Բաց մեթոդները");
            Method[] methods = c.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                int modifiers = methods[i].getModifiers();
                if (Modifier.isPublic(modifiers)){
                    System.out.println(methods[i].getName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

