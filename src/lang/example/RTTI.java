package lang.example;

public class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;
        // ստանում է Class տիպի օբյեկտի վրայի հղումը
        clObj = x.getClass();
        System.out.println("x - օբյեկտի տիպը " + clObj.getName());
        clObj = y.getClass();
        System.out.println("y - օբյեկտի տիպը " + clObj.getName());
        clObj = clObj.getSuperclass();
        System.out.println("y օբյեկտի սուպեր կլասսն է " + clObj.getName());
    }
}

