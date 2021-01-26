package lambda.example;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println("Ամրագրված արժեքը " + myNum.getValue());
        myNum = () -> Math.random() * 100;
        System.out.println("Պատահական արժեքը " + myNum.getValue());
        System.out.println("Եվս մի պատահական արժեք " + myNum.getValue());
        // չի կոմպիլացվի քանի որ լյամբդա արտահայտության տիպի տվյալը
        // պետք է համընկնի աբստրակտ մեթոդի տիպի տվյալ հետ
        // myNum = () -> "123.45";
    }
}

