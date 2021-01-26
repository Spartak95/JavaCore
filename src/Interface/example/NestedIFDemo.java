package Interface.example;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif2 = new A.NestedIF() {
            @Override
            public boolean isNotNegative(int x) {
                return false;
            }
        };
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10)){
            System.out.println("10 թիվը բացասական չէ");
        }
        if (nif.isNotNegative(-12)){
           System.out.println("Այս տողը չի կատարվի");
        }
    }
}



