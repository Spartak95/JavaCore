package lambda.example;

public class InstanceMethWithObjectRefFemo {
    public static <T> int counter(T[] vals, MyFunc2<T> f, T v){
        int count = 0;
        for (int i=0; i < vals.length; i++){
            if (f.func(vals[i], v)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        HighTemp[] weekDayHighs = {
           new HighTemp(89), new HighTemp(82),
           new HighTemp(90), new HighTemp(89),
           new HighTemp(89), new HighTemp(91),
           new HighTemp(84), new HighTemp(83),
        };
        int count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count + " օրում մաքսիմալ ջերմաստիճանը եղել 89");
        int count2 = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(91));
        System.out.println(count2 + " օրում մաքսիմալ ջերմաստիճանը փոքր է եղել 91");
    }
}

