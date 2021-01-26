package collection.example;

import java.util.EnumSet;

public class EnumSetDemo {
    enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    };
    public static void main(String[] args) {
        EnumSet<Numbers> set =  EnumSet.of(Numbers.ONE, Numbers.TWO);
        System.out.println("Set:" + set);
        EnumSet<Numbers> set2 =  EnumSet.allOf(Numbers.class);
        System.out.println("Set2:" + set2);
        EnumSet<Numbers> set3 = set2.clone();
        System.out.println("Set3:" + set3);
        EnumSet<Numbers> set4 =  EnumSet.range(Numbers.THREE, Numbers.FIVE);
        System.out.println("Set4:" + set4);
        EnumSet<Numbers> set5 =  EnumSet.complementOf(set4);
        System.out.println("Set5:" + set5);
        Numbers[] listing = {Numbers.ONE, Numbers.FOUR};
        EnumSet<Numbers> set6 =  EnumSet.of(Numbers.TWO, listing);
        System.out.println("Set6:" + set6);
        EnumSet<Numbers> set7 =  EnumSet.noneOf(Numbers.class);
        System.out.println("Set7:" + set7);
        EnumSet<Numbers> set8 =  EnumSet.copyOf(set6);
        System.out.println("Set8:" + set8);
    }
}

