package HomeWork;

public class LambdaEx {
    private static String funcStr(Func f, String a){
        return  f.fun(a);
    }
    private static String ref(String bn){
        return bn.toLowerCase();
    }
    public static void main(String[] args) {
        Func sd = (n) -> n.toUpperCase();
        String as = "Hello World";
        String fg = sd.fun(as);
        String ad = funcStr(sd, as);
        String ad2 = funcStr(LambdaEx::ref, as);
        System.out.println(ad);
        System.out.println(fg);
        System.out.println(ad2);
    }
}
