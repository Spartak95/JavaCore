package annotation.example;

import java.lang.annotation.*;

// պարամետրազացված աննոտացիա է, որը կարող
// ենք կիրառել տվյալների տիպի վրա
@Target(ElementType.TYPE_USE)
public @interface MaxLen {
    int value();
}

