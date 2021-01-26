package anonymous.example;

import Final.Final;

public class AnonDemo2 {
    public static void main(String[] args) {
        BaseClass bs = new BaseClass("BaseClass"){
            @Override
            public String getname() {
                return super.getname();
            }
            // անուն կլասսի ներսում հայտարարված մեթոդին
            // անանուն կլասսից դուրս չեն կարող ենք կանչել
            void stop() {
                System.out.println("Մեքենան կանգնում է");
            }
        };
        System.out.println(bs.getname());
    }
}
