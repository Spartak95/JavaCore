package first.example;

public class WhileLoop3 {
    public static void main(String[] args) {
        int i = 100, j = 200;
        // սա առանց մարմնի ցիկլ է
        while (++i < j--) System.out.println("Միջին արժեքը կլինի " + i); // 150
    }
}

