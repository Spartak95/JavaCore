package lang.example;

public class GetInterfaceDemo {
    public static void main(String[] args) {
        Class<GetInterfaceDemo> cls = GetInterfaceDemo.class;
        boolean b = cls.isInterface();
        System.out.println(b);
        Class<?> cls2 = MyClass.class;
        /*
        այս ձևը ևս համարժեք է վեր նշված կոդին
        MyClass ms = new MyClass();
        Class<?> cls2 = ms.getClass();
        */
        Class<?>[] interfaces = cls2.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }
}

