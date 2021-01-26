package annotation.example;

public class TypeAnnoDemo
        <@What(description = "Ընդհանրացված տիպի տվյալներ") T> {
    // աննոտավորվում է String տիպը, այլ ոչ թե փոփոխականին
    private @TypeAnno String str;
    // աննոտավորվում է test փոփոխականը
    private @EmptyOK String test;
    // տիպային աննոտացիան կիառվում է կոնստրուկտորի վրա
    public @Unique TypeAnnoDemo() {
    }
    // օբյեկտի վրայի this հղումը աննոտավորվելու
    // համար կիրառվում է տիպային աննոտացիա
    public int f(@TypeAnno TypeAnnoDemo<T> this, int x){
        return 10;
    }
    // աննոտավորվում է վերադարձվող տիպին
    public @TypeAnno Integer f2(int j, int k){
        return j + k;
    }
    // աննոտավորվում է հայտարարված մեթոդին
    public @Recommended Integer f3(String str){
        return str.length() / 2;
    }
    // throws օպերատորի հանդեպ
    // կիրառվում է տիպային աննոտացիա
    public void f4() throws @TypeAnno NullPointerException{
        // ...
    }
    // զանգվածի հասանելիության մակարդակի աննոտավորում
    private String @MaxLen(10) [] @NotZeroLen [] w;
    // զանգվածի էլեմենտի տիպը տիպավորվում է
    private @TypeAnno Integer[] vec;
    public static void myMeth(int i){
       // արգումենտի տիպի վրա կիրառվում է տիպային աննոտացիա
       TypeAnnoDemo<@TypeAnno Integer> ob =
               new TypeAnnoDemo<@TypeAnno Integer>();
       // new օպերատորի վրա կիրառվում է տիպային աննոտացիա
       @Unique TypeAnnoDemo<Integer> ob2 =
               new @Unique TypeAnnoDemo<Integer>();
       Object x = new Integer(10);
       Integer y;
       // տիպի վերափոխման վրա կիրառվում է տիպային աննոտացիա
       y = (@TypeAnno Integer) x;
    }
    public static void main(String[] args) {
       myMeth(10);
    }
    // ժառանգման արտահայտության վրա կիրառվում է տիպային աննոտացիա
    public class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean>{}
}

