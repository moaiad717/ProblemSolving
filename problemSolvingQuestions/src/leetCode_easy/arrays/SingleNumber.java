package leetCode_easy.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
 */

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i =0; i<=nums.length-1; i+=2){
            if(nums.length - i ==1)
                return nums[nums.length-1];

            if (nums[i] != nums[i+1])
                return nums [i];
        }
        return 0;
    }
}
