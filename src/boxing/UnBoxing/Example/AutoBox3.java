package boxing.UnBoxing.Example;

public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;
        iOb = 100;
        System.out.println("iOb փոփոխականի սկզմնական արժեքը " + iOb);
        ++iOb;
        System.out.println("++iOb հետո " + iOb);
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 հավասար է " + iOb2);
        i = iOb + (iOb / 3);
        System.out.println("i հավասար է " + i);
    }
}

