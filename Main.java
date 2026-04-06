
import java.util.Arrays;

public class Main {
    // The main method: the starting point of the program
    public static void main(String[] args) {
        int[] nums = {2,7,9,12};
        int target = 19;
        // Your code goes here
        System.out.println("Numbers: " + Arrays.toString(nums));        
        System.out.println("Target: " + target);
        System.out.println("Ouput: " + Arrays.toString(Solution.twoSum(nums, target)));
    }
}