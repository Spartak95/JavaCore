package override;

public class B extends A {
    public int k;
    public B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    public void show(String msg) {
        System.out.println(msg + k);
    }
}

