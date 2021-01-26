package lambda.example;

public class MethodReference {
    public static void main(String[] args) {
        Sayable st = () -> System.out.println("dfsd");
        st.say();
    }
}
