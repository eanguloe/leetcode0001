
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Boolean found = false;
        for(int i = 0; i <= (nums.length - 2); i++) {
            if (!found) {
                for ( int j = i + 1; j <= (nums.length - 1); j++ ) {
                    if ( (nums[i] + nums[j]) == target) {
                        result[0] = i;
                        result[1] = j;
                        found = true;
                    }
                }
            }
        }
        return result;
    }
}