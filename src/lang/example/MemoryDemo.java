package lang.example;

public class MemoryDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer[] someinits = new Integer[1000];
        System.out.println("Ընդհանուր հիշողությունը " +
                r.totalMemory() + " բայթ");
        mem1 = r.freeMemory();
        System.out.println("Սկզբնական ազատ հիշողությունը "
                + mem1 + " բայթ");
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Ազատ հիշողությունը մաքրելուց " +
                "հետո " + mem1 + " բայթ");
        for (int i=0; i<1000; i++){
            // առանձնացնում է հիշողությունը Integer տիպի օբյեկտների համար
            someinits[i] = new Integer(i);
        }
        mem2 = r.freeMemory();
        System.out.println("Ազատ հիշողությունը տրամադրելուց " +
                "հետո " + mem2 + " բայթ");
        System.out.println("Օգտագործվող հիշողությունը տրամադրման " +
                "համար " + (mem1-mem2) + " բայթ");
        for (int i=0; i<1000; i++){
            someinits[i] = null;
        }
        r.gc();
        mem2 = r.freeMemory();
        System.out.println("Ազատ հիշողությունը Integer տիպի " +
                "օբյեկտներից մաքրելուց հետո " + mem2 + " բայթ");
    }
}

