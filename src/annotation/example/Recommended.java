package annotation.example;

import java.lang.annotation.*;

// աննոտացիա է, որը կարող ենք կիրառել
// հայտարարված մեթոդների վրա
@Target(ElementType.METHOD)
public @interface Recommended { }

