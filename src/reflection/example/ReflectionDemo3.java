package reflection.example;

import java.lang.reflect.Modifier;

public class ReflectionDemo3 {
    public static void main(String[] args) {
        System.out.println(Modifier.toString(Modifier.methodModifiers()));
    }
}

