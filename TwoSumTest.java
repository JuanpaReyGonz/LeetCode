package two.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();
    @Test
    void testTwoSumExample1(){
        int[] nums = {2,5,5,11};
        int target = 10;
        int[] array = twoSum.twoSum(nums, target);
        int[] expectedResult = {1,2};
        Assertions.assertArrayEquals(expectedResult, array);
    }
    @Test
    void testTwoExample2(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] array = twoSum.twoSum(nums, target);
        int[] expectedResult = {0,1};
        Assertions.assertArrayEquals(expectedResult, array);
    }
    @Test
    void testTwoExample3(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] array = twoSum.twoSum(nums, target);
        int[] expectedResult = {1,2};
        Assertions.assertArrayEquals(expectedResult, array);
    }
    @Test
    void testTwoExample4(){
        int[] nums = {3,3};
        int target = 6;
        int[] array = twoSum.twoSum(nums, target);
        int[] expectedResult = {0,1};
        Assertions.assertArrayEquals(expectedResult, array);
    }
    @Test
    void testTwoExample5(){
        int[] nums = {2,5,5,11};
        int target = 20;
        int[] array = twoSum.twoSum(nums, target);
        int[] expectedResult = {-1,-1};
        Assertions.assertArrayEquals(expectedResult, array);
    }


}
