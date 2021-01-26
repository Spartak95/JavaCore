package inheritanceSuperExample;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("shipment1 ծավալը հավասար է " + vol);
        System.out.println("shipment1 քաշը հավասար է " + shipment1.weight);
        System.out.println("Փոխադրման արժեքը " + shipment1.cost + "$");
        System.out.println();
        vol = shipment2.volume();
        System.out.println("shipment2 ծավալը հավասար է " + vol);
        System.out.println("shipment2 քաշը հավասար է " + shipment2.weight);
        System.out.println("Փոխադրման արժեքը " + shipment2.cost + "$");
        System.out.println();
    }
}

