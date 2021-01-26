package generics.example;

public class GenIfDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};
        MyClass<Integer> iOb = new MyClass<Integer>(inums);
        MyClass<Character> cOb = new MyClass<Character>(chs);
        System.out.println("Մաքսիմալ արժեքը inums զանգվածում " + iOb.max());
        System.out.println("Մինիմալ արժեքը inums զանգվածում " + iOb.min());
        System.out.println("Մաքսիմալ արժեքը chs զանգվածում " + cOb.max());
        System.out.println("Մինիմալ արժեքը chs զանգվածում " + cOb.min());
    }
}

