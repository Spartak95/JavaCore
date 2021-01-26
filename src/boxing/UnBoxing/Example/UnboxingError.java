package boxing.UnBoxing.Example;

public class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = 1000; // 1000 արժեքը ավտոփաթեթավորվում է
        int i = iOb.byteValue(); // արժեքի ձեռքով բացում
        System.out.println(i); // 1000 արժեքը դուրս չի բերվում
    }
}


