package Interface.example;

public class Question implements SharedConstants {
    public void ask(int answer){
        if(answer==NO){
            System.out.println("NO = " + NO);
        }else if(answer==YES){
            System.out.println("YES = " + YES);
        }else if(answer==MAYBE){
            System.out.println("MAYBE = " + MAYBE);
        }else if(answer==LATER){
            System.out.println("LATER = " + LATER);
        }else if(answer==SOON){
            System.out.println("SOON = " + SOON);
        }else if(answer==NEVER){
            System.out.println("NEVER = " + NEVER);
        }
    }

}

