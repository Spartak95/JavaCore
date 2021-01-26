package concurrency.example;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {
    private int numPhases;
    public MyPhaser(int parties, int phaseCount) {
        super(parties);
        this.numPhases = phaseCount - 1;
    }
    // վերասահմանում ենք onAdvance( ) մեթոդին, որպեսզի
    // կատարի որոշակի քանակի փուլ
    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println(phase + " փուլը ավարտվել է\n");
        // վերադարձնում է true տրամաբանական արժեք, եթե բոլոր փուլերը ավարտվել է
        if (phase == numPhases || registeredParties == 0){
            return true;
        }
        // վերադարձնում է false տրամաբանական արժեք,
        // որպեսզի փուլի սինխրոնիզատորի աշխատանք շարունակվի
        return false;
    }
}

