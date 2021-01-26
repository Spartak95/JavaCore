package multithreading.example;

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread_1 t1 = new NewThread_1("Առաջին");
        NewThread_1 t2 = new NewThread_1("Երկրորդ");
        NewThread_1 t3 = new NewThread_1("Երրորդ");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Գլխավոր հոսքը ընդհատվեց");
        }
        System.out.println("Գլխավոր հոսքը ավարտվեց");
    }
}

