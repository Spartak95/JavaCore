package generics.example;

// հասարակ generics կլասսի օրինակ
// այստեղ T նշանակում է պարամետրի տիպը,
// որը կփոխարինվի իսկական տիպով
public class Gen<T> {
    // հայտարարենք T տիպի օբյեկտ
    private T ob;
    // կոնստրուկտորի պարամետրին փոխանցում ենք
    // T տիպի օբյեկտ
    public Gen(T ob){
      this.ob = ob;
    }
    // վերադարձնում է T տիպի օբյեկտ
    public T getOb(){
        return ob;
    }
    // ցուցադրում է T-ի տիպը
    public void showType(){
        System.out.println("T-ի տիպը հանդիսանում է " + ob.getClass().getName());
    }

}

