package arrayLength;

public class Stack {
    int[] stck;
    int tos;
    Stack (int size){
       stck = new int[size];
       tos = -1;
    }
    // տեղադրել էլեմենտները ստեկում
    void push (int item){
        if(tos == stck.length-1){
            System.out.println("Ստեկը լցված չէ");
        }
        else
            stck[++tos] = item;
    }
    //դուրս հանել էլեմենտները ստեկից
    int pop(){
       if (tos < 0){
           System.out.println("Ստեկը դեռ չի բեռնվել");
           return 0;
       }
       else
           return stck[tos--];
    }
}

