package util.example;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(8);
        bits1.set(0);
        bits1.set(1);
        bits1.set(3);
        bits1.set(4);
        bits1.set(6);
        BitSet bits2 = new BitSet(8);
        bits2.set(2);
        bits2.set(4);
        bits2.set(6);
        bits2.set(8);
        System.out.println("Bits1:" + bits1);
        System.out.println("Bits2:" + bits2);
        System.out.println("bits1.length() = " + bits1.length());
        System.out.println("bits1.size() = " + bits1.size());
        System.out.println("bits1.get(1) = " + bits1.get(1));
        System.out.println("bits1.get(2) = " + bits1.get(2));
        System.out.println("bits2.length() = " + bits2.length());
        System.out.println("bits2.size() = " + bits2.size());
        System.out.println("bits1.nextClearBit(1) - " + bits1.nextClearBit(1));
        System.out.println("bits2.previousClearBit(4) - " + bits2.previousClearBit(4));
        System.out.println("bits1.nextSetBit(4) - " + bits1.nextSetBit(4));
        System.out.println("bits2.previousSetBit(8) - " + bits2.previousSetBit(7));
        bits2.and(bits1);
        System.out.println("bits2 AND bits1: " + bits2);
    }
}



