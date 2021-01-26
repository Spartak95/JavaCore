package multithreading.example;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread_1 t1 = new NewThread_1("Առաջին");
        NewThread_1 t2 = new NewThread_1("Երկրորդ");
        NewThread_1 t3 = new NewThread_1("Երրորդ");
        System.out.println("Առաջին հոսքը մեկնարկած է " + t1.t.isAlive());
        System.out.println("Երկրորդ հոսքը մեկնարկած է " + t2.t.isAlive());
        System.out.println("Երրորդ հոսքը մեկնարկած է " + t3.t.isAlive());
        try{
            System.out.println("Սպասելով հոսքերի ավարտին");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }catch (InterruptedException e){
            System.out.println("Գլխավոր հոսքը ընդհատվեց");
        }
        System.out.println("Առաջին հոսքը մեկնարկած է " + t1.t.isAlive());
        System.out.println("Երկրորդ հոսքը մեկնարկած է " + t2.t.isAlive());
        System.out.println("Երրորդ հոսքը մեկնարկած է " + t3.t.isAlive());
        System.out.println("Գլխավոր հոսքը ավարտվեց");
    }
}

