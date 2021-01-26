package inheritance.example.privateaccess;

public class Access {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Գումարը հավասար է " + subOb.total);
    }
}

