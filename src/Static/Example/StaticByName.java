package Static.Example;

public class StaticByName {

    public static void main(String[] args) {
        UserStatic s1 = new UserStatic();
        UserStatic s2 = new UserStatic();
        UserStatic.meth(5);
        UserStatic.meth(2);
        StaticDemo.callme();
        UserStatic.b = 12;
        System.out.println("b = " + UserStatic.b);
    }

}

