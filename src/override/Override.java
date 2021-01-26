package override;

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        // կանչում է show մեթոդը B կլասսից
        subOb.show("k: ");
        // կանչում է show մեթոդը A կլասսից
        subOb.show();
    }
}

