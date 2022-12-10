package leetCode_easy.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
 *
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> integerMap= new HashMap();
        for (int i =0; i< nums.length; i++){
            if (integerMap.containsKey(nums[i]))
                return true;
            else
                integerMap.put(nums[i],0);
        }
        return false;
    }
}
