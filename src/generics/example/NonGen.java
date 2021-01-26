package generics.example;

public class NonGen {
    private Object ob;
    public NonGen(Object ob){
      this.ob = ob;
    }
    public Object getOb(){
        return ob;
    }
    public void showType(){
        System.out.println("ob օբյեկտը վերաբերվում " + ob.getClass().getName() + " տիպին");
    }
}

