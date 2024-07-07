package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
 *
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        new ContainsDuplicate().containsDuplicate(new int[]{1,2});
    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integerMap= new HashSet<>();
        for (int i =0; i< nums.length; i++){

            System.out.println(integerMap.add(1));
            System.out.println(integerMap.add(1));
            if (integerMap.contains(nums[i]))
                return true;
            else
                integerMap.add(nums[i]);
        }

        return false;


    }
}
