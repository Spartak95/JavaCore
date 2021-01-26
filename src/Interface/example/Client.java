package Interface.example;

public class Client implements CallBack {
    @Override
    public void callBack(int param) {
        System.out.println("callBack() մեթոդը կանչվում է "
                                       + param + " արժեքով");
    }
    public void nonIfaceMeth(){
        System.out.println("Կլասսը, որը ռեալիզացնում է ինտերֆեյսներ "
                                  + "կարող է ունենալ այլ մեթոդներ");
    }
}

