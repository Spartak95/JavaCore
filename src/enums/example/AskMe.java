package enums.example;

public class AskMe {
    public static void answer(Answers result){
       switch (result){
           case NO:
             System.out.println("Ոչ");
             break;
           case YES:
               System.out.println("Այո");
               break;
           case MAYBE:
               System.out.println("Հնարավոր է");
               break;
           case LATER:
               System.out.println("Ուշ է");
               break;
           case SOON:
               System.out.println("Շուտով");
               break;
           case NEVER:
               System.out.println("Երբեք");
               break;
       }
    }
    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}

