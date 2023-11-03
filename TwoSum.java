package two.sum;
/**
 * @author Juan Pablo Reyes González
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        for (int j=0; j<nums.length-1; j++)
        {
            int actual = nums[j];
            for (int i = j; i< nums.length-1; i++){
                if (actual+nums[i+1] == target){
                    return new int[]{j, i+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
