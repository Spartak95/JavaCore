package io.example;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.printf("Ամբողջական թվերի տարբեր ֆորմատները ");
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);
        System.out.printf("Լողացող կետով թվի ֆորմատ %f\n", 1234567.123);
        System.out.printf("Ստորակետով բաժանված լողացող կետով թվի ֆորմատ %,f\n", 1234567.123);
        System.out.printf("Լողացող կետով բացասական թվի ֆորմատ %,f\n", -1234567.123);
        System.out.printf("Լողացող կետով բացասական թվի այլ ֆորմատ %,(f\n", -1234567.123);
    }
}

