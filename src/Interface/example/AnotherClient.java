package Interface.example;

public class AnotherClient implements CallBack{
    @Override
    public void callBack(int p) {
        System.out.println("callBack մեթոդի ևս մեկ տարբերակ");
        System.out.println(p + " թվի քառակուսին հավասար է " + (p*p));
    }
}

