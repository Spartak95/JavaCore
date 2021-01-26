package lang.example;

public class STEDemo {
    public static void main(String[] args) {
        method1();
    }
    public static void method1() {
        method2();
    }
    public static void method2() {
        method3();
    }
    public static void method3() {
        System.out.println("Մեթոդների կանչման հետագիծը\n");
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.print(element.getMethodName());
            System.out.println(" մեթոդին կանչելու տողի համար կլինի " + element.getLineNumber());
            System.out.println("Կլասսի անունը, որտեղից որ մեթոդը կանչվում է " +  element.getClassName());
            System.out.println();
        }
    }
}

