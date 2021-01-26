package annotation.example;

import java.lang.annotation.*;

// աննոտացիա է, որը կարող
// ենք կիրառել տիպի պարամետրերի վրա
@Target(ElementType.TYPE_PARAMETER)
public @interface What {
    String description();
}

