package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for(int i = 0; i<nums.length; i++){

            if (numsMap.containsKey(nums[i])){

                return new int[]{i, numsMap.get(nums[i])};

            }
            else
                numsMap.put(target-nums[i],i);
        }

        return new int[]{0,0};
    }
}
