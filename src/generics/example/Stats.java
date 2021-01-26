package generics.example;

public class Stats<T extends Number> {
    private T[] nums;
    public Stats(T[] nums){
        this.nums = nums;
    }
    public double average(){
        double sum = 0.0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
}

