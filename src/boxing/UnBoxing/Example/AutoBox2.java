package boxing.UnBoxing.Example;

public class AutoBox2 {
    public static int m(Integer v){
        return v;
    }
    public static void main(String[] args) {
        Integer in = new Integer(100);
        Integer iOb = m(120);
        System.out.println(iOb);
    }
}

