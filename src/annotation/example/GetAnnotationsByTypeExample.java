package annotation.example;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class GetAnnotationsByTypeExample {
    public static void main(String... args) {
        System.out.println("-- using getAnnotation(MultiAccess.class) --");
        MultiAccess multiAccess = MyClass.class
                .getAnnotation(MultiAccess.class);
        for (Access access : multiAccess.value()) {
            System.out.println(access);
        }

        System.out.println("-- using getAnnotationsByType(Access.class) --");
        Access[] accessAnnotations = MyClass.class
                .getAnnotationsByType(Access.class);
        for (Access access : accessAnnotations) {
            System.out.println(access);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(MultiAccess.class)
    public @interface Access {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface MultiAccess {
        Access[] value();
    }

    @MultiAccess({@Access("SUPER_USER"), @Access("CUSTOMER")})
    private static class MyClass {
    }
}
