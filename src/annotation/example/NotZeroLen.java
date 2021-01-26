package annotation.example;

import java.lang.annotation.*;

// մարկեր աննոտացիա է, որը կարող
// ենք կիրառել տվյալների տիպի վրա
@Target(ElementType.TYPE_USE)
public @interface NotZeroLen { }

