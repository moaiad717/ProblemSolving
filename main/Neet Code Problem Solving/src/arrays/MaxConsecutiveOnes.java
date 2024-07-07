package arrays;

import java.util.Map;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/max-consecutive-ones/description/
 */

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums  == null || nums.length==0)
            return 0;

        if (nums.length ==1){
            if(nums[0]==1)
                return 1;
            else
                return 0;
        }

        int max=0;
        int count=0;
        int left=0;
        int right=left+1;


        while (right<nums.length){
            int leftValue= nums[left];

            if (leftValue!=1){
                left++;
                right=left+1;
            }
            else if(leftValue==nums[right]){
                count++;
                right++;
            }
            else{
                left=right + 1;
                right= left+1;
                max =Math.max(max,count);
                count=0;
            }
        }
        max =Math.max(max,count);

        return ++max;
    }
}
