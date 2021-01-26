package generics.example;

public class Stats2<T extends Number> {
    private T[] nums;
    public Stats2(T[] nums){
        this.nums = nums;
    }
    public double average(){
        double sum = 0.0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
    public boolean sameAvg(Stats2<?> ob){
        return average() == ob.average();
    }

}

