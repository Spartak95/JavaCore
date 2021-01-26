package concurrency.example;

// Այս կլասսը կանչվում է CyclieBarrier
// տիպի խոչընդոտին հաղթահարելուց հետո
public class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Խոչնընդոտ հաղթահարված է");
    }
}

